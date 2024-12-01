package com.restaurante.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.restaurante.services.ReservaService;
import com.restaurante.models.Reserva;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @GetMapping("/reservas/estado/{status}")
    public List<Reserva> getReservasByStatus(@PathVariable String status) {
        return reservaService.findReservasByStatus(status);
    }

    @GetMapping("/reservas/fecha/{date}")
    public List<Reserva> getReservasByDate(@PathVariable String date) {
        LocalDateTime parsedDate = LocalDateTime.parse(date); // Convertir el string a LocalDateTime
        return reservaService.findReservasByDate(parsedDate);
    }
}
