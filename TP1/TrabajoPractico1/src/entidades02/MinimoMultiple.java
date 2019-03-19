package entidades02;

import java.util.ArrayList;

public class MinimoMultiple<TipoDeElemento> {
	
	private double valor;
	private ArrayList<TipoDeElemento> elementos;

	public MinimoMultiple() {
		elementos = new ArrayList<>();
		setValor(Double.MAX_VALUE);
	}

	public void procesar(double nuevoValor, TipoDeElemento candidato) {
		if (nuevoValor < valor) {
			setValor(nuevoValor);
			elementos.clear();
		}
		if (nuevoValor == valor) {
			elementos.add(candidato);
		}
		
	}

	public double getValor() {
		return valor;
	}
	
	public ArrayList<TipoDeElemento> getElementos() {
		return elementos;
	}

	private void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "MinimoMultiple [valor=" + valor + ", elementos=" + elementos + "]";
	}

}
