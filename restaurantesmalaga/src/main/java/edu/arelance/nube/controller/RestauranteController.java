package edu.arelance.nube.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.arelance.nube.repository.entity.Restaurante;
import edu.arelance.nube.service.RestauranteService;
import io.swagger.v3.oas.annotations.Operation;

/**
 * 
 * API WEB HTTP -> Deriva en la ejecucion de un mètodo
 * 
 * GET -> Consultar TODOS GET -> Consultar UNO (por ID) POST -> Insertar un
 * restaurante nuevo PUT -> Modificar un restaurante que ya existe DELETE ->
 * Borrar un restaurante (por ID) BUSQUEDA -> Por barrio, por especialidad, por
 * nombre, etc...
 */

@Controller // Devolvemos una lista vista htmljsp
@RestController // Devolvemos de JSON http://localhost:8081/restaurante/test

@RequestMapping("/restaurante")
public class RestauranteController {

	@Autowired
	RestauranteService restuaranteService;

	@GetMapping("/test")
	public Restaurante obtenerRestauranteTest() {
		Restaurante restaurante = null;
		
		String saludo = "Hola";
		saludo.charAt(10);

		System.out.println("llamando a obtenerRestauranteTest");
		restaurante = new Restaurante(1l, "Martinete", "Carlos Haya 33", "Carranque", "www.martinete.org",
				"https://google.xe", 33.65f, -2.3f, 10, "Gazpacheuelo", "paella", "sopa de marisco",
				LocalDateTime.now());

		return restaurante;

	}

	// GET -> Consultar TODOS GET http://localhost:8081/restaurante/test
	@GetMapping
	public ResponseEntity<?> obtenerListaRestaurantes() {
		ResponseEntity<?> responseEntity = null;
		// ResponseEntity<?> representa un mensaje http
		
		
//		String saludo = "Hola";
//		saludo.charAt(10);

		Iterable<Restaurante> lista_Restaurantes = null;

		lista_Restaurantes = this.restuaranteService.consultarTodos();
		responseEntity = ResponseEntity.ok(lista_Restaurantes);// construyendo el mensaje de vuelta

		return responseEntity;
	}

	// GET -> Consultar uno (por ID)
	@Operation(description = "Este metodoservicio permite la consulat de restuarantes por un ID")
	@GetMapping("/{id}")
	public ResponseEntity<?> ListarID(@PathVariable Long id) {
		ResponseEntity<?> responseEntity = null;
		Optional<Restaurante> or = null;
		or = this.restuaranteService.consultarRestaurante(id);
		if (or.isPresent()) {
			// La consulta ha recuperado un registro
			Restaurante restauranteLeido = or.get();

			responseEntity = responseEntity.ok(restauranteLeido);
		}

		else {
			// La consulta no ha recurado un registro
			responseEntity = ResponseEntity.noContent().build();
		}

		return responseEntity;
	}

	// POST -> Insertar un nuevvo restaurante
	@PostMapping
	public ResponseEntity<?> insertarRestaurante(@RequestBody Restaurante restaurante) {
		ResponseEntity<?> responseEntity = null;
		Restaurante restauranteNuevo = null;

		restauranteNuevo = this.restuaranteService.altaRestaurante(restaurante);
		responseEntity = ResponseEntity.status(HttpStatus.CREATED).body(restauranteNuevo);
		return responseEntity;
	}

	// PUT-> modificar un restuarante en nla bbdd

	@PutMapping("/{id}")
	public ResponseEntity<?> modificarRestaurante(@RequestBody Restaurante restaurante, @PathVariable Long id) {
		ResponseEntity<?> responseEntity = null;

		return responseEntity;
	}

	// DELETE -> Consultar uno (por ID) http://localhost:8081/restaurante/test
	@DeleteMapping("/{id}")
	public ResponseEntity<?> borrarPorID(@PathVariable Long id) {
		ResponseEntity<?> responseEntity = null;

		this.restuaranteService.borrarRestaurante(id);
		responseEntity = ResponseEntity.ok().build();

		return responseEntity;
	}

}
