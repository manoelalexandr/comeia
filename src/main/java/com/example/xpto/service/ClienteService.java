package com.example.xpto.service;

import com.example.xpto.repository.ClienteRepository;
import com.example.xpto.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService( ClienteRepository clienteDao) {
        this.clienteRepository = clienteDao;
    }

    public Cliente addCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public List<Cliente> getAllCliente(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getClienteByCpf(String cpfCnpj){
        return clienteRepository.findByCpfCnpj(cpfCnpj);
    }

    public int deleteCliente(String cpfCnpj){
        Optional<Cliente> toDelete = getClienteByCpf(cpfCnpj);
        if(toDelete.isEmpty()){
            return 0;
        }
        this.clienteRepository.delete(toDelete.get());
        return 1;
    }

    public int updateCliente (String cpfCnpj, Cliente update){
        return 1;
    }
}

