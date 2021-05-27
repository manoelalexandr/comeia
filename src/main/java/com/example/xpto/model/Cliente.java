package com.example.xpto.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    private final String cpfCnpj;
    private final String nome;
    @OneToOne
    private Endereco endereco;
    @OneToMany
    private List<Conta> conta;
    private String telefone;
    @CreationTimestamp
    @Column(updatable = false, nullable = false)
    private final LocalDateTime dataCadastro;

    public Cliente(long id, String cpfCnpj, String nome, Endereco endereco, List<Conta> conta,
                   String telefone, LocalDateTime dataCadastro) {
        this.id = id;

        this.cpfCnpj = cpfCnpj;
        this.nome = nome;
        this.endereco = endereco;
        this.conta = conta;
        this.telefone = telefone;
        this.dataCadastro = dataCadastro;
    }
}
