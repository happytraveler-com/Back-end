package com.example.happyTraveler.services;


import com.example.happyTraveler.models.usuarios;
import com.example.happyTraveler.repositories.IUusuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class UsuariosService {

    @Autowired
    IUusuarios IUusuarios;
    //create or update
    public void saveOrUpdate(usuarios usuarios) {

        IUusuarios.save(usuarios);
    }
    //read
    public List<usuarios> getUsuarios(){

        return IUusuarios.findAll();
    }
    //read by id
    public Optional<usuarios> getUsuario(Long id){
       return IUusuarios.findById(id);
    }

    //delete by id
    public void deleteUsuario(Long id){

        IUusuarios.deleteById(id);
    }

}
