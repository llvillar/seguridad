package com.llv.examen6.portal.seguridad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.llv.examen6.portal.seguridad.models.Usuario;
import com.llv.examen6.portal.seguridad.services.UsuarioService;

@RestController
public class LoginController {
    
    @Autowired
    UsuarioService service;

    @PostMapping(path = { "/login" })
    public Usuario login(@RequestBody Usuario usuario){

        Usuario login = service.login(usuario.getNombre());
        return login;

    }

}
