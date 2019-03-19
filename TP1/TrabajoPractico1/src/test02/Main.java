package test02;

import entidades02.Atleta;
import entidades02.MinimoMultiple;



public class Main {

	public static void main(String[] args) {
		MinimoMultiple<Atleta> ganador = new MinimoMultiple<>();

		ganador.procesar(9, new Atleta("HB"));
		mostrar(ganador);
		ganador.procesar(10, new Atleta("HC"));
		mostrar(ganador);
		ganador.procesar(9, new Atleta("BH"));
		mostrar(ganador);
		ganador.procesar(7, new Atleta("Speedy Gonzalez"));
		mostrar(ganador);
	}

	private static void mostrar(MinimoMultiple<Atleta> ganadores) {
		// mas adelante vamos a ver como
		System.out.println(ganadores.getValor());
		for (Atleta corredor : ganadores.getElementos()) {
			System.out.println(corredor);
		}
	}

}
