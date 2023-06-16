package basicosprofe;

/**
 * 
 * 
 * @author Val
 *
 *         El código de esta clase, es un poco misterioso. Algún programador
 *         Clase "C", no ha usado nombres descriptivos y ahora, nos toca
 *         pegarnos y descubrir qué narices hace este código, para poder usarlo
 *         en nuestro proyecto.
 *
 *
 *         Se pide:
 *
 *         1) Adivinar la funcionalidad del método adivinaQueHace 2) Una vez
 *         descubierto, aplicar un nombre apropiado al método y a la clase 3)
 *         Idear un método equivalente, pero distinto. Es decir, crear un método
 *         que haga lo mismo que adivinaQueHace, pero de otra manera. 4) EXTRA:
 *         Sólo si resolviste los puntos anteriores, implementa una versión
 *         recursiva
 *
 */
//public class Capicua {

//	private static stringToBool (String cad)
//	{
//		boolean bd = true;
//		
//		int i = 0;
//		int j = cad.length()-1;
//		
//		while ((i<=j)&&(bd))
//		{
//			bd = cad.charAt(i)==cad.charAt(j);
//			System.out.println(bd);
//			i++;
//			System.out.println(i);
//			j--;
//			System.out.println(j);
//		}
//		
//		
//		return bd;
//	}

//	
//	public static void main(String[] args) {
//		if (stringToBool("poop"))
//		{
//			System.out.println("VERDADERO");
//		} else 
//		{
//			System.out.println("FALSO");
//		}
//	}

//}

public class AnalizaPalabra {
	private static boolean isPalindrome(String texto) {
		boolean test = true;

		int cont = texto.length() - 1;

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == texto.charAt(cont)) {
				test = true;
			}

			else {
				test = false;
			}

			--cont;
		}

		return test;
	}

	public static void main(String[] args) {
		if (isPalindrome("poop")) {
			System.out.println("VERDADERO");
		}

		else {
			System.out.println("FALSO");
		}

	}

}

//La mejor opcion
public class AnalisisPalabra {
	
	
	private static boolean esPalindromo2(String cadena) {
		boolean compara = false;
	
		StringBuilder inverso = new StringBuilder(cadena).reverse();
		
		String cadena2 = inverso.toString();
		
		System.out.println(cadena2);//para comprobar que invierte la cadena
		
			if (cadena2.equals(cadena)) {
				compara = true;
			}
			
			return compara;
	}
	
	
	public static void main(String[] args) {
	
		if (esPalindromo2("ramar"))
		{
			System.out.println("ES UN PALINDROMO");
		} else 
		{
			System.out.println("NO ES UN PALINDROMO");
		}
		
	}