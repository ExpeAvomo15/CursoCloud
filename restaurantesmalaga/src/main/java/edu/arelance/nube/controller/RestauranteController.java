package edu.arelance.nube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.arelance.nube.repository.entity.Restaurante;

/**
 * 
 * API WEB 
 * HTTP -> Deriva en la ejecucion de un mètodo
 * 
 * GET -> Consultar TODOS
 * GET -> Consultar UNO (por ID)
 * POST -> Insertar un restaurante nuevo
 * PUT -> Modificar un restaurante que ya existe
 * DELETE -> Borrar un restaurante (por ID)
 * BUSQUEDA -> Por barrio, por especialidad, por nombre, etc...
 */

@Controller //Devolvemos una lista vista htmljsp
@RestController //Devolvemos de JSON http://localhost:8081/restaurante/test

@RequestMapping("/restaurante")
public class RestauranteController {

	@GetMapping("/test")
	public Restaurante obtenerRestauranteTest() {
		Restaurante restaurante = null;
		
		System.out.println("llamando a obtenerRestauranteTest");
		
		return restaurante;
		
	}
}
