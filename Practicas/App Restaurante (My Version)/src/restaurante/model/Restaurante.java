package restaurante.model;

import java.util.List;

public class Restaurante {
	// id?¿
	private String nombre;
	private String direccion;
	private String web;
	private String fichaGoogle;
	private float latitud;
	private float longitud;
	private String barrio;
	private List<String> especialidades;
	private int precioMedio;
	
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getWeb() {
		return web;
	}


	public void setWeb(String web) {
		this.web = web;
	}


	public String getFichaGoogle() {
		return fichaGoogle;
	}


	public void setFichaGoogle(String fichaGoogle) {
		this.fichaGoogle = fichaGoogle;
	}


	public float getLatitud() {
		return latitud;
	}


	public void setLatitud(float latitud) {
		this.latitud = latitud;
	}


	public float getLongitud() {
		return longitud;
	}


	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}


	public String getBarrio() {
		return barrio;
	}


	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}


	public List<String> getEspecialidades() {
		return especialidades;
	}


	public void setEspecialidades(List<String> especialidades) {
		this.especialidades = especialidades;
	}


	public int getPrecioMedio() {
		return precioMedio;
	}


	public void setPrecioMedio(int precioMedio) {
		this.precioMedio = precioMedio;
	}


	public Restaurante() {
		// TODO Auto-generated constructor stub
	}


	public Restaurante(String nombre, String direccion, String web, String fichaGoogle, float latitud, float longitud,
			String barrio, List<String> especialidades, int precioMedio) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.web = web;
		this.fichaGoogle = fichaGoogle;
		this.latitud = latitud;
		this.longitud = longitud;
		this.barrio = barrio;
		this.especialidades = especialidades;
		this.precioMedio = precioMedio;
	}


	@Override
	public String toString() {
		return "Restaurante [nombre=" + nombre + ", direccion=" + direccion + ", web=" + web + ", fichaGoogle="
				+ fichaGoogle + ", latitud=" + latitud + ", longitud=" + longitud + ", barrio=" + barrio
				+ ", especialidades=" + especialidades + ", precioMedio=" + precioMedio + "]";
	}
	
	
	
}


