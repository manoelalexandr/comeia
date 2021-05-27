package com.example.xpto.repository;

import com.example.xpto.model.Cliente;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>  {

    Optional<Cliente> findByCpfCnpj(String cpfCnpj);

    int deleteClienteById(Long id);

}
