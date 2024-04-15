package com.seminario194.Despegando.api.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class HotelResponse {
    private String name;
    private  String address;
    private  Integer rating;
    private BigDecimal price;
}
