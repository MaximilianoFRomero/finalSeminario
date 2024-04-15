package com.seminario194.Despegando.domain.repositories;

import com.seminario194.Despegando.domain.entities.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {
}
