package com.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restaurante.models.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
