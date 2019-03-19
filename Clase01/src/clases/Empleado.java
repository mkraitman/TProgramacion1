package clases;

public class Empleado {

	private String dni;
	private String puesto;
	
	public Empleado(String dni, String puesto) {
		super();
		this.dni = dni;
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", puesto=" + puesto + "]";
	}
	
	
}
