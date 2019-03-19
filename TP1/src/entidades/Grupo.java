package entidades;

import java.util.ArrayList;

public class Grupo {

	private String nombreGrupo;
	private ArrayList<Integrante> integrantes;

	public Grupo(String nombre) {
		super();
		this.nombreGrupo = nombre;
	}

	public String getNombreGrupo() {
		return nombreGrupo;
	}

	public void setNombreGrupo(String nombre) {
		this.nombreGrupo = nombre;
	}

	public int getCantidadIntegrantes() {

		return integrantes.size();
	}

	public Integrante buscarIntegrante(String nombreIntegrante) {
		Integrante integrante = null;
		Integrante aux = null;
		int i = 0;
		while (i < getCantidadIntegrantes() && integrante == null) {
			aux = integrantes.get(i);
			if (aux.getNombre().equals(nombreIntegrante)) {
				integrante.equals(aux);

			} else {
				i++;

			}
		}
		return integrante;
	}

}
