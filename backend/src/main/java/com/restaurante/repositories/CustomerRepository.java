package com.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restaurante.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
