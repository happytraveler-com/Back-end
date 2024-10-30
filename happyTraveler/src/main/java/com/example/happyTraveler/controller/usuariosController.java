package com.example.happyTraveler.controller;

import com.example.happyTraveler.models.usuarios;
import com.example.happyTraveler.services.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/usuarios")

public class usuariosController {
    @Autowired
    private UsuariosService usuariosService;

    // read
    @GetMapping
    public List<usuarios> getAllUsuarios(){

        return usuariosService.getUsuarios();
    }
    // read by id
    @GetMapping("/{usuarioId}")
    public Optional<usuarios> getUsuarioById(@PathVariable("usuarioId") Long usuarioId){
       return usuariosService.getUsuario(usuarioId);
    }

    // create or update
    @PostMapping
    public void saveOrUpdate(@RequestBody usuarios usuarios){

        usuariosService.saveOrUpdate(usuarios);
    }
    // delete
    @DeleteMapping("/{usuarioId}")
    public void deleteusuario (@PathVariable("usuarioId") Long usuarioId) {
        usuariosService.deleteUsuario(usuarioId);
    }

}
