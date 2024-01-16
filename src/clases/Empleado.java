package clases;

public abstract class Empleado {
	private String nombre;
	private double salario;
	
	public abstract double calcularSalario();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}