package com.example.api_HelpVeiculos.service;

import com.example.api_HelpVeiculos.model.Guinchos;
import com.example.api_HelpVeiculos.repository.GuinchoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GuinchoService {
    @Autowired
    private GuinchoRepository guinchoRepository;

    public Guinchos solicitarGuincho(Guinchos guincho) {
        System.out.println("Solicitação de guincho recebida para o veículo: " + guincho.getId());
        return guinchoRepository.save(guincho);
    }

    public List<Guinchos> listarGuinchos() {
        return guinchoRepository.findAll();
    }
}
