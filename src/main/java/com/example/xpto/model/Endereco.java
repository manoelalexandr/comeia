package com.example.xpto.model;

import com.fasterxml.jackson.databind.deser.std.UUIDDeserializer;
import lombok.Data;

@Data
public class Endereco {

    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private long id;


}
