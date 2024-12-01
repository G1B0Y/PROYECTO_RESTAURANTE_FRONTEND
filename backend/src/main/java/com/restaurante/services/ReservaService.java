package com.restaurante.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restaurante.repositories.ReservaRepository;
import com.restaurante.models.Reserva;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    // Buscar reservas por estado
    public List<Reserva> findReservasByStatus(String status) {
        return reservaRepository.findByStatus(status);
    }

    // Buscar reservas por fecha
    public List<Reserva> findReservasByDate(LocalDateTime date) {
        return reservaRepository.findByDate(date);
    }
}
