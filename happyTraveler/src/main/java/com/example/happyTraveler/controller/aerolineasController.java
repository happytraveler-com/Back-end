package com.example.happyTraveler.controller;

import com.example.happyTraveler.models.aerolineas;
import com.example.happyTraveler.services.AerolineasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/aerolineas")
public class aerolineasController {
    @Autowired
    private AerolineasService aerolineasService;

    //read
    @GetMapping
    public List<aerolineas> getAllAerolineas() {
        return aerolineasService.getAerolineas();
    }
    // read by id
    @GetMapping("/{aerolineaId}")
    public Optional<aerolineas> getAerolineaById(@PathVariable("aerolineaId") Long aerolineaId){
        return aerolineasService.getAerolinea(aerolineaId);
    }
    // create or update
    @PostMapping
    public void saveOrUpdate(@RequestBody aerolineas aerolineas){
        aerolineasService.saveOrUpdate(aerolineas);
    }
    // delete
    @DeleteMapping("/{aerolineaId}")
    public void deleteAerolinea(@PathVariable("aerolineaId") Long aerolineaId){
        aerolineasService.deleteAerolinea(aerolineaId);
    }
}
