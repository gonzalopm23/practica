package arraysbidimensionales;

public class Bici {
	
	private String id;
	private String color;
	private String marca;
	private double precio;
	
	//Constructor
	public Bici(String id, String color, String marca, double precio) {
		this.id = id;
		this.color = color;
		this.marca = marca;
		this.precio = precio;
	}
	
	//Constructor copia
	public Bici(final Bici inBici) {
		id = inBici.getId();
		color = inBici.getColor();
		marca = inBici.getMarca();
		precio = inBici.getPrecio();
	}

	//getters y setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void mostrarInfo() {
		System.out.println("INFORMACIÓN DE LA BICI:\nIdentificador: "+id+"\nColor: "+color
				+"\nMarca: "+marca+"\nPrecio: "+precio+" €\n");
	}
	
}
