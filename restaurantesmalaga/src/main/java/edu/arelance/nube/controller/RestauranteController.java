package edu.arelance.nube.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.arelance.nube.repository.entity.Restaurante;
import edu.arelance.nube.service.RestauranteService;

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
	@Autowired
	RestauranteService restuaranteService;

	@GetMapping("/test")
	public Restaurante obtenerRestauranteTest() {
		Restaurante restaurante = null;
		
		System.out.println("llamando a obtenerRestauranteTest");
		restaurante = new Restaurante(1l, "Martinete", "Carlos Haya 33","Carranque", "www.martinete.org", "https://google.xe", 33.65f, -2.3f, 10, "Gazpacheuelo", "paella","sopa de marisco",LocalDateTime.now());
		
		return restaurante;
		
	}
	
	// GET -> Consultar TODOS GET http://localhost:8081/restaurante/test
    @GetMapping
	public ResponseEntity<?> obtenerListaRestaurantes (){
	 ResponseEntity<?>  responseEntity = null;
	 //ResponseEntity<?> representa un mensaje http
	 Iterable<Restaurante> lista_Restaurantes = null;
	lista_Restaurantes = this.restuaranteService.consultarTodos();
     responseEntity =	ResponseEntity.ok(lista_Restaurantes);
	 return responseEntity;
 }
	// GET -> Consultar uno (por ID)
    @GetMapping("/id")
	public ResponseEntity<?> ListarID (@PathVariable Long id){
    	ResponseEntity<?> responseEntity = null;
    	
    	return responseEntity;
    }
    
 // DELETE -> Consultar uno (por ID)  http://localhost:8081/restaurante/test
    @DeleteMapping("/id")
	public ResponseEntity<?> borrarPorID (@PathVariable Long id){
    	ResponseEntity<?> responseEntity = null;
    	
    	return responseEntity;
    }
	
}
