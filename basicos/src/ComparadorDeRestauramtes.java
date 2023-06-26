import java.util.Comparator;

public class ComparadorDeRestauramtes implements Comparator<Restaurante> {d

	@Override
	public int compare(Restaurante o1, Restaurante o2) {
		// TODO Auto ordenar por nombre
		return o1.getNombre().compareTo(o2.getNombre());
	}


}
