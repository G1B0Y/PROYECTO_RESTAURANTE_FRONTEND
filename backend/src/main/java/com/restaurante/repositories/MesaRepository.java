package com.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restaurante.models.Mesa;
import java.util.List;

public interface MesaRepository extends JpaRepository<Mesa, Long> {

    // Método para buscar mesas con capacidad mayor o igual a un valor dado
    List<Mesa> findByCapacityGreaterThanEqual(int capacity);
}
