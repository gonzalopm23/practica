package ejerciciosarrays;

public class Alumno {
	private double nota;
	private String dni;
	private String nombre;
	
	public Alumno(double nota, String dni, String nombre) {
		this.nota = nota;
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public double getNota() {
		return nota;
	}
	
	public String getNombre() {
		return nombre;
	}
}
