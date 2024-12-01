package com.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restaurante.models.Reserva;
import java.time.LocalDateTime;
import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {

    // Método para buscar reservas por estado
    List<Reserva> findByStatus(String status);

    // Método para buscar reservas por fecha
    List<Reserva> findByDate(LocalDateTime date);
}
