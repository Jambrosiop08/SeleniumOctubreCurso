package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {
	static String Heredar = "Mensaje de texto Herencia";
	
	protected static List<String> listaDeNombres(){
		List<String> listaNombres = new ArrayList<>();
		listaNombres.add("Sergio");
		listaNombres.add("Juan");
		listaNombres.add("Sofia");
		listaNombres.add("Agustín");
		listaNombres.add("Juan");
		return listaNombres;
	}
	
	protected static List<Integer> listaNumeros(){
		List<Integer> listaNumeros = new ArrayList <>();
		
			listaNumeros.add(1);
			listaNumeros.add(1);
			listaNumeros.add(6);
			listaNumeros.add(78);
			listaNumeros.add(12);
		return listaNumeros;
	}
	
	
	
}
