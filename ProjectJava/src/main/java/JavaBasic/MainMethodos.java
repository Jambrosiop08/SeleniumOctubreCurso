package JavaBasic;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainMethodos  extends Metodos2{
	
	public static void main (String[] args) {
		Metodos nombreObjeto = new Metodos();
		Metodos nombreObjeto2 = new Metodos (9,3);
		//Metodos2 objeto = new Metodos2();
		
		System.out.println(nombreObjeto2.sumatoria());
		System.out.println(nombreObjeto.sumatoria());
		
		nombreObjeto.mostrarMensaje();
		
		String elementoGuardado = nombreObjeto.mostrarNombre("Sergio");
		
		System.out.println(elementoGuardado);
		Metodos.prueba();
		System.out.println(Heredar);
		
		List<String> listaNombres = listaDeNombres();
		List<Integer> ListaNumeros = listaNumeros();
		
		
		for(String nombre : listaNombres) {
			System.out.println(nombre);
		}
		System.out.println("For con dos puntos");
		
		for (int indice=0 ; indice<listaNombres.size(); indice++) {
			System.out.println(listaNombres.get(indice));
		}
		System.out.println("For con indice");
		
		for(int numero : ListaNumeros){
			System.out.println(numero);
		}
		
		List<String> nombresSinElementosDuplicados = listaNombres
				.stream()
				.distinct()
				.collect(Collectors.toList());
		Collections.sort(nombresSinElementosDuplicados);
		System.out.println(nombresSinElementosDuplicados);
		Collections.sort(nombresSinElementosDuplicados,Collections.reverseOrder());
		System.out.println(nombresSinElementosDuplicados);
		
		System.out.println(Collections.max(ListaNumeros));
		System.out.println(Collections.min(ListaNumeros));
		Collections.sort(ListaNumeros);
		System.out.println(ListaNumeros);
		Collections.sort(ListaNumeros,Collections.reverseOrder());
		System.out.println(ListaNumeros);
		
		Object last = null;
		int numCount = 0;
		Iterator<Integer> i = ListaNumeros.iterator();
		
		while(i.hasNext()) {
			Object temp = i.next();
			if(temp.equals(last)){
				i.remove();
				numCount++;//numCount = numCount + 1;
			}else {
				last=temp;
			}
		}
		System.out.println(numCount);
		System.out.println(ListaNumeros);
		
	
		
	} //main

}