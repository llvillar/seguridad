package com.llv.examen6.portal.seguridad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.llv.examen6.portal.seguridad.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
    public Usuario findByNombre(String nombre);

}
