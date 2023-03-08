package com.llv.examen6.portal.seguridad.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llv.examen6.portal.seguridad.models.Usuario;
import com.llv.examen6.portal.seguridad.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;
    
    public Usuario login(String nombre){

        Usuario usuario = repository.findByNombre(nombre);
        return usuario;
    }
}
