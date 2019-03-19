package entidades02;

public class Atleta {

	private String nombre;

	public Atleta(String nombre) {
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Atleta [nombre=" + nombre + "]";
	}
	
	
}
