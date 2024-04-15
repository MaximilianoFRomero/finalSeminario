package com.seminario194.Despegando.api.services;

import com.seminario194.Despegando.api.dtos.HotelResponse;
import com.seminario194.Despegando.domain.entities.HotelEntity;
import com.seminario194.Despegando.domain.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

}
