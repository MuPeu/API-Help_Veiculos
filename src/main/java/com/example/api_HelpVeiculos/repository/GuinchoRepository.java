package com.example.api_Help_Veiculos.repository;

import com.example.api_Help_Veiculos.model.Guinchos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GuinchoRepository extends JpaRepository<Guinchos, Integer> {
    // Aqui você pode adicionar métodos personalizados se necessário
}
