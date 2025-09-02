package com.example.api_Help_Veiculos.controller;

import com.example.api_Help_Veiculos.model.Guinchos;
import com.example.api_Help_Veiculos.service.GuinchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/guincho")

public class GuinchoController {
    @Autowired
    private GuinchoService guinchoService;

    @PostMapping("/solicitar")
    public ResponseEntity<Guinchos> solicitarGuincho(@RequestBody Guinchos guincho) {
        Guinchos novoGuincho = guinchoService.solicitarGuincho(guincho);
        return new ResponseEntity<>(novoGuincho, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Guinchos>> listarGuinchos() {
        List<Guinchos> guinchos = guinchoService.listarGuinchos();
        return new ResponseEntity<>(guinchos, HttpStatus.OK);
    }
}
