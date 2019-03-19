package entidades01;

public class Integrante {

	private String nombre;

	public Integrante(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Integrante [nombre=" + nombre + "]";
	}
	
	
}
