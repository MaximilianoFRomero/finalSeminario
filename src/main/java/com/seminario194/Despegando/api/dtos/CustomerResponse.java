package com.seminario194.Despegando.api.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Getter
@Builder
public class CustomerResponse {
    private String dni;
    private String fullName;
    private String creditCard;
    private String phoneNumber;
    private Integer totalFlights;
    private Integer totalLodgings;
    private Integer totalTours;
}
