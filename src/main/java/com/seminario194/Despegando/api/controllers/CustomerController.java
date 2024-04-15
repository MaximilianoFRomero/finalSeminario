package com.seminario194.Despegando.api.controllers;

import com.seminario194.Despegando.api.dtos.CustomerRequest;
import com.seminario194.Despegando.api.dtos.CustomersResponse;
import com.seminario194.Despegando.api.services.CustomerService;
import com.seminario194.Despegando.domain.entities.CustomerEntity;
import com.seminario194.Despegando.domain.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import java.sql.SQLException;
import java.util.List;


@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepository repository;

    @GetMapping
    @ResponseBody
    public CustomersResponse listCustomers(){
        return customerService.listCustomers();
    }

    @PostMapping
    public ResponseEntity newCustomer(@RequestBody CustomerRequest customerRequest){
        return customerService.setCustomer(customerRequest);
    }

    @PutMapping("/{dni}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateCustomer(@PathVariable("dni") String dni, @RequestBody CustomerRequest customerRequest){
        return customerService.updateCustomer(customerRequest, dni);
    }

    @DeleteMapping("/{dni}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteCustomer(@PathVariable("dni") String dni)
        throws SQLException{
        try{
            customerService.deleteCustomer(dni);
            return ResponseEntity.ok("Customer deleted");
        }
        catch (Exception exception){
            return ResponseEntity.badRequest().body("Error");
        }
    }


}
