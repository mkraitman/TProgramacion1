package entidades03;

import entidades02.Atleta;
import entidades02.MinimoMultiple;

public class PodioV2 {

	private static final int CANT_POSICIONES = 3;
	// Java no nos deja guardar un vector de ArrayList u otros objetos que usan Generics.
	// Hay dos opciones: una es crear un vector de Objects.MinimoMultiple<Atleta>
	private Object[] posiciones;

	public PodioV2() {
		posiciones = new Object[CANT_POSICIONES];
		inicializarPosiciones();
	}

	private void inicializarPosiciones() {
		// Crear el array no alcanza: tengo que poner los objetos
		// correspondientes para que no pinche por null.
		// La otra forma es dejar los null y preguntar antes de "usar" la
		// posicion si hay un null o un objeto.
		for (int i = 0; i < posiciones.length; i++) {
			posiciones[i] = new MinimoMultiple<Atleta>();
		}
	}

	/**
	 * Procesa el tiempo del atleta, y si corresponde lo "sube" al podio, aunque
	 * sea temporalmente (porque alguien puede desplazarlo).
	 * 
	 * @param valor
	 *            El tiempo obtenido en la carrera.
	 * @param atleta
	 *            El atleta
	 */
	public void procesar(int valor, Atleta atleta) {
		System.out.println("Proceso el valor " + valor);
		int pos = buscarPosicion(valor);
		if (pos != CANT_POSICIONES) {
			guardar(valor, pos, atleta);
		}
	}

	/**
	 * Se encarga de poner al atleta en la posicion del podio que corresponda.
	 * 
	 * @param valor
	 *            El valor que obtuvo
	 * @param pos
	 *            La posicion donde debe guardarlo
	 * @param atleta
	 *            El atleta que va al podio
	 */
	private void guardar(int valor, int pos, Atleta atleta) {
		if (ObjectAMinMult(posiciones[pos]).getValor() != valor) {
			desplazar(pos);
		}
		ObjectAMinMult(posiciones[pos]).procesar(valor, atleta);
	}

	/**
	 * "Corre" las posiciones mas "lentas" para "hacer lugar" para un nuevo
	 * tiempo. S�lo se hace lugar si el nuevo espacio es el primero o el segundo
	 * lugar del podio, y las posiciones se corren en "cascada" (se corre el
	 * segundo al tercer lugar, y recien entonces muevo del primero al segundo,
	 * si debe hacerlo).
	 * 
	 * Habra alguna manera de hacer esto de otra forma?
	 * 
	 * @param pos
	 *            La posicion donde debe hacerse lugar.
	 */
	private void desplazar(int pos) {
		// va segundo o primero?
		if (pos < 2) {
			posiciones[2] = posiciones[1];
			// va primero?
			if (pos < 1) {
				posiciones[1] = posiciones[0];
			}
			// ya hice lugar, ahora pongo el nuevo para "romper el enlace" con
			// el que ten�a antes.
			posiciones[pos] = new MinimoMultiple<Atleta>();
		}
	}

	/**
	 * Busca la posicion en el podio donde corresponde (si corresponde) poner al
	 * atleta (al menos temporalmente).
	 * 
	 * @param valor
	 *            El valor de comparacion
	 * @return el indice de la posicion donde debe cargarse. Si es igual al
	 *         largo del array significa que no queda en el podio.
	 */
	private int buscarPosicion(int valor) {
		int pos = 0;
		while (pos < posiciones.length && valor > ObjectAMinMult(posiciones[pos]).getValor()) {
			pos++;
		}
		return pos;
	}

	/**
	 * Muestra los tiempos que entraron en el podio y los ganadores.
	 */
	public void mostrar() {
		System.out.println("Tiempos ganadores");
		for (int i = 0; i < posiciones.length; i++) {
			if (ObjectAMinMult(posiciones[i]).getValor() != Double.MAX_VALUE) {
				System.out.println(posiciones[i]);
			}
		}
	}

	/**
	 * Convierte el objeto recibido en un MinimoMultiple<Atleta>
	 * 
	 * @param obj
	 *            El objeto a convertir
	 * @return El mismo objeto, pero "enmascarado" como MinimoMultiple<Atleta>
	 */
	@SuppressWarnings("unchecked")
	private MinimoMultiple<Atleta> ObjectAMinMult(Object obj) {
		return (MinimoMultiple<Atleta>) obj;
	}

}