package AppRestaurante;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainMapas {
	
	
	private static final String RUTA_FICHERO = "restaurantes.txt";
	  
	public static Map<String, List<Restaurante>> mapaRestaurantesBarrio (String barrio, List<Restaurante>lRest){
		  Map<String, List<Restaurante>>mapAuxBarrio = null;
		  List<Restaurante> buscaRestBarrioAux = null;
		 
		  buscaRestBarrioAux = new ArrayList<>();
		  
		 buscaRestBarrioAux = MainRestaurante.buscarRestaurantesPorBarrio(lRest, barrio);
		  
		  mapAuxBarrio= new HashMap<>();
		  
		  mapAuxBarrio.put(barrio, buscaRestBarrioAux);
		  return mapAuxBarrio;
	  }
	
  private static Restaurante obtenerMasCaro (List<Restaurante> lrb) {
		Restaurante restMasCaro = null;
		int precioMayor = 0;
		
		
		for (Restaurante r : lrb) {
			
			if(r.getPrecioMedio()>precioMayor) {
				
			restMasCaro = r;
			precioMayor = r.getPrecioMedio();
			}
		}
		
		
		
		return restMasCaro;
	}
	
	public static void main(String[] args) throws IOException {
		

		//TODO Cargar la lista de restaurantes del fichero
		 File file = new File(RUTA_FICHERO);
		if (file.exists())
		{
			System.out.println("FICHERO EXISTE!, a parsearlo :)");
			Path path = file.toPath();//convierto a PATH para usar el nuevo API y así ir más rápido
			List<String> lineas = Files.readAllLines(path);//leo todo el fichero en una línea
			List<Restaurante> listRest =  MainRestaurante.cargarRestaurantes(lineas);
			
	        Map <String, Restaurante> mapaRestaurante = new HashMap<>();
	        
	        for (Restaurante r : listRest ) {
	        	mapaRestaurante.put(r.getNombre(), r);
	        }
	        System.out.println(mapaRestaurante);
	        
	        Restaurante rp = mapaRestaurante.get("La parrilla");
	        
	      
	        
	
		}
		else {
			System.out.println("FICHERO NO EXISTE!");
		}
	}
	
	public static List<Restaurante> masCaros (Map<String, List<Restaurante>>mapaR){
		List<Restaurante> listaCaros = null;
		
		//TODO recorrer el mapa por barrios y quedarme con el mas caro de cada barrio
	   Set<String> barrios = mapaR.keySet();
	   for (String barrio : barrios) {
	   List<Restaurante> lrb =  mapaR.get(barrio);
	   Restaurante rmascaro = obtenerMasCaro (lrb);
	   }
		
		return listaCaros;
		

	}

}
//APUNTE: El TreeMap ordena por la clave.

//ToDo partiendo de la lista de restaurantes hacer un mapa donde la clave sea el barrio y el valor 
//la lista de restraurantes de ese barrio.


//partiendo del mapa de restauyrantes por barrios, haced un metodo que devuelva los restaurantes más caros de cada barrio