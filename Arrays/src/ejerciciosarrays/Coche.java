package ejerciciosarrays;

public class Coche {
	private String matricula;
	private String color;
	private double precio;
	private int a�o;
	
	public Coche(String matricula, String color, double precio, int a�o) {
		this.matricula = matricula;
		this.color = color;
		this.precio = precio;
		this.a�o = a�o;
	}

	public String getMatricula() {
		return matricula;
	}
	
	public String getColor() {
		return color;
	}

	public double getPrecio() {
		return precio;
	}

	public int getA�o() {
		return a�o;
	}
	
	
}
