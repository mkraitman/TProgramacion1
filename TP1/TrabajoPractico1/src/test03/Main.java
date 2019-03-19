package test03;

import entidades02.Atleta;
import entidades03.Podio;

public class Main {

	public static void main(String[] args) {
		// Esta version de Podio es "copia"
		// de PodioV3
		Podio podio = new Podio();
		podio.procesar(30, new Atleta("Juan"));
		//podio.mostrar();
		podio.procesar(50, new Atleta("Luis"));
		//podio.mostrar();
		podio.procesar(50, new Atleta("Ruben"));
		//podio.mostrar();
		podio.procesar(60, new Atleta("Dany"));
		//podio.mostrar();
		podio.procesar(30, new Atleta("Jorge"));
		//podio.mostrar();
		podio.procesar(40, new Atleta("Carlos"));
		//podio.mostrar();
		podio.procesar(45, new Atleta("Diego"));
		//podio.mostrar();
		podio.procesar(20, new Atleta("Agustin"));
		podio.mostrar();

	}

}