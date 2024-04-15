package com.seminario194.Despegando.domain.repositories;

import com.seminario194.Despegando.domain.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;


public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {
    List<CustomerEntity> findByDni(String dni);
    List<CustomerEntity> findByFullName(String fullName);
}
