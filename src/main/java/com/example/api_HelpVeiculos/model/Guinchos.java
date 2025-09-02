package com.example.api_Help_Veiculos.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_guinchos")

public class Guinchos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_chamado;

    @Column (nullable = false)
    private String placa;

    @Column (nullable = false)
    private String nomeCliente;

    @Column (nullable = false)
    private String telefone;

    @Column (nullable = false)
    private String endereco;

    @Column (nullable = false)
    private String cidade;

    public Guinchos (){

    }

    public Guinchos(Integer id_chamado, String placa, String nomeCliente, String telefone, String endereco, String cidade) {
        this.id_chamado = id_chamado;
        this.placa = placa;
        this.nomeCliente = nomeCliente;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
    }

    public Integer getId() { return id_chamado; }
    public void setId(Integer id_chamado) { this.id_chamado = id_chamado; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) {
        if (placa != null && (
                placa.matches("^[A-Z]{3}-[0-9]{4}$") || // Antiga
                placa.matches("^[A-Z]{3}[0-9][A-Z][0-9]{2}$") // Nova
        )) {
            this.placa = placa;
        } else {
            throw new IllegalArgumentException("Placa inválida!");
        }
    }

    public String getNomeCliente() { return nomeCliente; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) {
        if (telefone != null && telefone.matches("^[0-9]{11}$")) {
            this.telefone = telefone;
        } else {
            throw new IllegalArgumentException("Número de telefone inválido!");
        }
    }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }
}
