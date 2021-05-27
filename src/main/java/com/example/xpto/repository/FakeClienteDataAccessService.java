package com.example.xpto.repository;

import com.example.xpto.model.Cliente;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class FakeClienteDataAccessService implements ClienteRepository {


    private static List<Cliente> DB = new ArrayList<>();


    @Override
    public Optional<Cliente> selectClienteById(String cpfCnpj) {
        return DB.stream().filter(cliente -> cliente.getCpfCnpj().equals(cpfCnpj)).findFirst();
    }

    @Override
    public int deleteClienteByCpf(String cpfCnpj) {
        Optional<Cliente> clienteMaybe = selectClienteById(cpfCnpj);
        if(clienteMaybe.isEmpty()){
            return 0;
        }
        DB.remove(clienteMaybe.get());
        return 1;
    }

    @Override
    public int updateClienteByCpf(String cpfCnpj, Cliente update) {
        return selectClienteById(cpfCnpj)
                .map(c -> {
                    int indexOfClienteToUpdate = DB.indexOf(c);
                    if(indexOfClienteToUpdate >= 0){
                        DB.set(indexOfClienteToUpdate,new Cliente(update., update.getCpfCnpj(), update.getNome(), update.getEndereco(),update.getConta(), update.getTelefone(), update.dataCadastro));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }

    @Override
    public Optional<Cliente> findByCpfCnpj(String cpfCnpj) {
        return Optional.empty();
    }

    @Override
    public int deleteClienteById(Long id) {
        return 0;
    }

    @Override
    public List<Cliente> findAll() {
        return null;
    }

    @Override
    public List<Cliente> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Cliente> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Cliente> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Cliente cliente) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> iterable) {

    }

    @Override
    public void deleteAll(Iterable<? extends Cliente> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Cliente> S save(S s) {
        return null;
    }

    @Override
    public <S extends Cliente> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Cliente> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Cliente> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public <S extends Cliente> List<S> saveAllAndFlush(Iterable<S> iterable) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Cliente> iterable) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Cliente getOne(Long aLong) {
        return null;
    }

    @Override
    public Cliente getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Cliente> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Cliente> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Cliente> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Cliente> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Cliente> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Cliente> boolean exists(Example<S> example) {
        return false;
    }
}
