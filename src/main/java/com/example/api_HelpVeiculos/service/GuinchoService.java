package com.example.api_Help_Veiculos.service;

import com.example.api_Help_Veiculos.model.Guinchos;
import com.example.api_Help_Veiculos.repository.GuinchoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class GuinchoService {
    @Autowired
    private GuinchoRepository guinchoRepository;

    public Guinchos solicitarGuincho(Guinchos guincho) {
        System.out.println("Solicitação de guincho recebida para o veículo: " + guincho.getPlaca());
        return guinchoRepository.save(guincho);
    }

    public List<Guinchos> listarGuinchos() {
        return guinchoRepository.findAll();
    }
}
