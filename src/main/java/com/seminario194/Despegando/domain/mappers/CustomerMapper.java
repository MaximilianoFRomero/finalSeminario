package com.seminario194.Despegando.domain.mappers;

import com.seminario194.Despegando.api.dtos.CustomerRequest;
import com.seminario194.Despegando.api.dtos.CustomerResponse;
import com.seminario194.Despegando.api.dtos.CustomersResponse;
import com.seminario194.Despegando.domain.entities.CustomerEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerMapper {
    public CustomerEntity customerRequestToCustomer(CustomerRequest customerRequest){

        CustomerEntity customer = CustomerEntity.builder()
                .dni(customerRequest.getDni())
                .fullName(customerRequest.getFullName())
                .creditCard(customerRequest.getCreditCard())
                .phoneNumber(customerRequest.getPhoneNumber())
                .totalFlights(customerRequest.getTotalFlights())
                .totalLodgings(customerRequest.getTotalLodgings())
                .totalTours(customerRequest.getTotalTours())
                .build();

        return customer;
    }

    public CustomersResponse customerListToResponse(List<CustomerEntity> customers){
        List<CustomerResponse> customerResponseList = new ArrayList<>();

        for(CustomerEntity customerEntity : customers){
            CustomerResponse customerResponse = CustomerResponse.builder()
                    .dni(customerEntity.getDni())
                    .fullName(customerEntity.getFullName())
                    .phoneNumber(customerEntity.getPhoneNumber())
                    .totalFlights(customerEntity.getTotalFlights())
                    .totalLodgings(customerEntity.getTotalLodgings())
                    .totalTours(customerEntity.getTotalTours())
                    .build();
            customerResponseList.add(customerResponse);
        }
        CustomersResponse customersResponse = CustomersResponse.builder()
                .customers(customerResponseList)
                .build();
        return customersResponse;
    }
}
