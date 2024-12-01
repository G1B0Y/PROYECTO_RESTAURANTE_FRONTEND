package com.restaurante.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.restaurante.repositories.MesaRepository;
import com.restaurante.models.Mesa;
import java.util.List;

@RestController
public class MesaController {

    @Autowired
    private MesaRepository mesaRepository;

    // Obtener todas las mesas
    @GetMapping("/mesas")
    public List<Mesa> getAllMesas() {
        return mesaRepository.findAll();
    }

    // Obtener mesas con capacidad mayor o igual
    @GetMapping("/mesas/capacidad/{capacidad}")
    public List<Mesa> getMesasByCapacidad(@PathVariable int capacidad) {
        return mesaRepository.findByCapacityGreaterThanEqual(capacidad);
    }
}
