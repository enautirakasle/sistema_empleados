package main;

import clases.EmpleadoAsalariado;
import clases.EmpleadoPorHoras;

public class App {

	public static void main(String[] args) {
		EmpleadoAsalariado ea1 = new EmpleadoAsalariado("Koldo");
		
//		ea1.setNombre("Koldo");
		ea1.setSalario(2000);
		System.out.println("Empleado: " + ea1.getNombre());
		System.out.println("Salario: " + ea1.calcularSalario());
		
		EmpleadoPorHoras eh1 = new EmpleadoPorHoras("Iker", 8);
		eh1.setSalario(12);
//		eh1.setNombre("Iker");
//		eh1.setHorasTrabajadas(8);
		
		System.out.println("Empleado: " + eh1.getNombre());
		System.out.println("Salario: " + eh1.calcularSalario());

	}

}
