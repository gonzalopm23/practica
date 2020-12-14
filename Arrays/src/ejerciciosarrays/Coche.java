package ejerciciosarrays;

public class Coche {
	private String matricula;
	private String color;
	private double precio;
	private int año;
	
	public Coche(String matricula, String color, double precio, int año) {
		this.matricula = matricula;
		this.color = color;
		this.precio = precio;
		this.año = año;
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

	public int getAño() {
		return año;
	}
	
	
}
