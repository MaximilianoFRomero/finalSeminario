package com.seminario194.Despegando;

import com.seminario194.Despegando.domain.repositories.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.UUID;

@SpringBootApplication
@Slf4j
public class DespegandoApplication implements CommandLineRunner{
	private final CustomerRepository customerRepository;

    public DespegandoApplication(
			CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;

    }

    public static void main(String[] args) {
		SpringApplication.run(DespegandoApplication.class, args);
	}

	@Override
	public void run(String... args)throws Exception{

	}
}

