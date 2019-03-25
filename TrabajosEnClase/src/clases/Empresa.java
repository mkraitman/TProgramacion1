package clases;

public class Empresa {

	private String nombre;
	private String cuit;
	private Empleado [] empleados;
	private final int CANT_MAX =20;
	public Empresa(String nombre, String cuit) {
		super();
		this.cuit = cuit;
		this.nombre = nombre;
		this.empleados = new Empleado [CANT_MAX];
	}

	public void verEmpleados() {
		
		int i = 0;
		while(this.empleados[i] != null && i < CANT_MAX) {
			System.out.println(this.empleados[i].toString());
			i++;
		}
	}
		
	
	
	public void agregarEmpleado(String dni, String puesto) {
		Empleado e = new Empleado(dni,puesto);
		boolean continuar = false;
		int i = 0;
		while(continuar || i< CANT_MAX) {
			if(this.empleados[i]==null) {
				this.empleados[i] = e;
				continuar = false;
			}
			i++;
		}
		
		

	}
	
	
}
