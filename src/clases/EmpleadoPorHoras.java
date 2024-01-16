package clases;

public class EmpleadoPorHoras extends Empleado{
	private double horasTrabajadas;
	
	public EmpleadoPorHoras(String nombre, double horasTrabajadas) {
		super(nombre);
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double calcularSalario() {
		return horasTrabajadas*getSalario();
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	
	

}
