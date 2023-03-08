package com.llv.examen6.portal.seguridad;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.llv.examen6.portal.seguridad.models.Permiso;
import com.llv.examen6.portal.seguridad.models.Usuario;
import com.llv.examen6.portal.seguridad.repositories.PermisoRepository;
import com.llv.examen6.portal.seguridad.repositories.UsuarioRepository;

@SpringBootTest
class UsuarioRepositoryTests {

	@Autowired
	UsuarioRepository repoU; 
	
	@Autowired
	PermisoRepository repoP; 

	@Test
	void crearUsuarioTest() {

		Usuario u1 = new Usuario();
		u1.setNombre("usuario1");
		u1.setPassword("1234");


		// Usuario u2 = new Usuario();
		// u2.setCodigo("2");
		// u2.setName("usuario2");
		// u2.setPassword(encoder.encode("1234"));


		// Usuario u3 = new Usuario();
		// u3.setCodigo("3");
		// u3.setName("usuario3");
		// u3.setPassword(encoder.encode("1234"));

		// Usuario u4 = new Usuario();
		// u4.setCodigo("4");
		// u4.setName("usuario4");
		// u4.setPassword(encoder.encode("1234"));

		Permiso p_admin = new Permiso();
		p_admin.setCodigo("1");
		p_admin.setCodigo("ADMIN");

		repoP.save(p_admin);

	



		List<Permiso> permisosUsaurio1 = new ArrayList<Permiso>();
		permisosUsaurio1.add(p_admin);

		u1.setPermisos(permisosUsaurio1);


		Usuario u1OK = repoU.save(u1);

		assertTrue(u1.getPassword().equalsIgnoreCase(u1OK.getPassword()));
	}

}
