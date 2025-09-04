package com.example.api_HelpVeiculos.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_guinchos")

public class Guinchos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id_chamado")
    private Integer id_chamado;

    @JsonProperty("placa")
    @Column (nullable = false)
    private String placa;

    @JsonProperty("nome_cliente")
    @Column (nullable = false)
    private String nome_cliente;

    @JsonProperty("telefone")
    @Column (nullable = false)
    private String telefone;

    @JsonProperty("endereco")
    @Column (nullable = false)
    private String endereco;

    @JsonProperty("cidade")
    @Column (nullable = false)
    private String cidade;

    public Guinchos (){

    }

    public Guinchos(Integer id_chamado, String placa, String nome_cliente, String telefone, String endereco, String cidade) {
        this.id_chamado = id_chamado;
        this.placa = placa;
        this.nome_cliente = nome_cliente;
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

    public String getNomeCliente() { return nome_cliente; }
    public void setNomeCliente(String nome_cliente) { this.nome_cliente = nome_cliente; }

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
