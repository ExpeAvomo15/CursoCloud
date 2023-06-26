

	import java.util.Comparator;
	import java.util.List;

import AppRestaurante.Restaurante;

	
	public class ComparadorPrtecioRestaurantes implements Comparator<Restaurante> {

		@Override
		public int compare(Restaurante o1, Restaurante o2) {
			
			return o1.getPrecioMedio().compareTo(o2.getPrecioMedio());
		}
		


	}

}
