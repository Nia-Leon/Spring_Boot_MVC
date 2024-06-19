package com.adso.Project2.service;

import com.adso.Project2.model.Registro;
import com.adso.Project2.repository.RepositoryRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceRegistro {
    @Autowired
    private RepositoryRegistro repositoryRegister;

    public List<Registro> getAllRegistro(){
        return repositoryRegister.findAll();
    }
    public Registro saveRegister(Registro registro){
        return repositoryRegister.save(registro);
    }
    public void deleteRegister(Long id) {
        repositoryRegister.deleteById(id);
    }
    public Registro getRegisterById(Long id) {
        return repositoryRegister.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid register Id:" + id));
    }

    public void updateRegister(Registro registro) {
        repositoryRegister.save(registro);
    }
}
