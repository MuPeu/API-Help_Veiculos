package com.example.api_HelpVeiculos.service;

import com.example.api_HelpVeiculos.model.Guinchos;
import com.example.api_HelpVeiculos.repository.GuinchoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service

public class GuinchoService {
    @Autowired
    private GuinchoRepository guinchoRepository;

    public Guinchos solicitarGuincho(Guinchos guincho) {
        System.out.println("Solicitação de guincho recebida para o veículo: " + guincho.getId());
        return guinchoRepository.save(guincho);
    }

    public void deletarGuincho(Integer id_chamado) {
        if (guinchoRepository.existsById(id_chamado)) {
            guinchoRepository.deleteById(id_chamado);
        } else {
            throw new RuntimeException("Solicitação não encontrada");
        }
    }

    public List<Guinchos> listarGuinchos() {
        return guinchoRepository.findAll();
    }
}
