package com.seminario194.Despegando.api.controllers;

import com.seminario194.Despegando.api.dtos.CustomersResponse;
import com.seminario194.Despegando.api.dtos.HotelResponse;
import com.seminario194.Despegando.api.services.HotelService;
import com.seminario194.Despegando.domain.entities.HotelEntity;
import com.seminario194.Despegando.domain.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @Autowired
    private HotelRepository hotelRepository;

    @GetMapping
    @ResponseBody
    public List<HotelEntity> listHotel(){
        return hotelRepository.findAll();
    }
}
