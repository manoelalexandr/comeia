package com.example.xpto.service;

import com.example.xpto.model.Cliente;
import com.example.xpto.repository.ContaRepository;
import com.example.xpto.model.Conta;

import java.util.List;


public class ContaService {

    private final ContaRepository contaRepository;

    public ContaService(ContaRepository contaDao) {
        this.contaRepository = contaDao;
    }

    public Conta addConta(Conta conta){
        return contaRepository.save(conta);
    }

    public List<Conta> getAllConta(){
        return contaRepository.findAll();
    }

}
