package com.example.xpto.service;

import org.springframework.beans.factory.annotation.Autowired;


public class EnderecoService {

    private final EnderecoDao enderecoDao;

    @Autowired
    public EnderecoService(EnderecoDao enderecoDao) {
        this.enderecoDao = enderecoDao;
    }

    public int addEndereço (Endereco endereco){
        return enderecoDao.insertEndereco(endereco);
    }
}
