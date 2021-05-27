package com.example.xpto.api;

import com.example.xpto.model.Cliente;
import com.example.xpto.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/cliente")
@RestController
public class ClienteController {

    private final ClienteService clienteService;


    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;

    }
    @PostMapping(path = "/add")
    public void addCliente(@RequestBody Cliente cliente){
        clienteService.addCliente(cliente);
    }

    @GetMapping
    public List<Cliente> getAllCliente(){
        return clienteService.getAllCliente();
    }

    @GetMapping (path = "{id}")
    public Cliente getClienteById(@PathVariable("id") String cpfCnpj){
        return clienteService.getClienteByCpf(cpfCnpj)
                .orElse(null);
    }
    @DeleteMapping(path = "{id}")
    public int deleteClienteById(@PathVariable("id") String cpfCnpj){
    return clienteService.deleteCliente(cpfCnpj);
    }

    @PutMapping
    public void updateCliente(@PathVariable("id") String cpfCnpj, @RequestBody Cliente clienteToUpdate){
        clienteService.updateCliente(cpfCnpj, clienteToUpdate);
    }

}
