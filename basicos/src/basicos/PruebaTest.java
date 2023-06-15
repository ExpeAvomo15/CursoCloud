package basicos;

public class PruebaTest {
	public int calcula ()
	{
	return 1+1;
	}


public static void main(String[] args) {
	System.out.println("Hola Málaga");
	Object cadena = "hola";
	//File fichero = (File) cadena;
	
	if(cadena instanceof String saludo) {
		System.out.println("Cadena es un string");
		String palabra  = (String) cadena;
		int l = palabra.length();
		System.out.println("Cadena es un String de tamaño: " +l);
	}
	//System.out.println(calcula());
	
//	for (int a=0; (a%6)<6; a++)
//	{
//	System.out.println (a);
//	
//	}
}
}