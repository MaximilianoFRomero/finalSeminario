package com.seminario194.Despegando.api.dtos;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CustomersResponse {
    private List<CustomerResponse> customers;
}
