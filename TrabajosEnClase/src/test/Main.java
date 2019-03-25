package test;

import clases.Empresa;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empresa empresa = new Empresa("Mercado Libre", "2103721893792108");
		
		empresa.agregarEmpleado("39841438", "Desarrollador");
		empresa.agregarEmpleado("94281374", "Proyect Manager");
		
		empresa.verEmpleados();
	}

}
