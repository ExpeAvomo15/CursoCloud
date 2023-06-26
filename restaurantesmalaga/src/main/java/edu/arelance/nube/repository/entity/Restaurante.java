package edu.arelance.nube.repository.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurantes")
public class Restaurante {
    
	@Id//indico a sprint que este será la clave la primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)//autoInc Mysql
	private Long id;
	
    private String nombre;
	
	private String direccion;
	
	private String barrio;
	
	private String web;
	
	private String fichaGoogle;
	
	private Float latitud;
	
	private Float longuitud;
	
	private Integer precio;
	
	private String especialidad1;
	
	private String especialidad2;
	
	private String especialidad3;
	
}
