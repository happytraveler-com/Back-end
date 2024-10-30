package com.example.happyTraveler.services;

import com.example.happyTraveler.models.aerolineas;
import com.example.happyTraveler.repositories.IUaerolineas;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class   AerolineasService {
    @Autowired
    IUaerolineas IUAerolineas;
    //create or update
    public void saveOrUpdate(aerolineas aerolineas) {

        IUAerolineas.save(aerolineas);
    }
    //read
    public List<aerolineas> getAerolineas(){

        return IUAerolineas.findAll();
    }
    //read by id
    public Optional<aerolineas> getAerolinea(Long id){

        return IUAerolineas.findById(id);
    }
    //delete by id
    public void deleteAerolinea(Long id){

        IUAerolineas.deleteById(id);
    }

}
