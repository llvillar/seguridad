package com.llv.examen6.portal.seguridad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.llv.examen6.portal.seguridad.models.Permiso;

@Repository
public interface PermisoRepository extends JpaRepository<Permiso, String>{
    
}
