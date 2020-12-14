package ejerciciosarrays;

public class PruebaMecanicos {

	public static void main(String[] args) {

		Coche coche1 = new Coche("1234ABC","rojo",5000,2012);
		Mecanico mec1 = new Mecanico("Gonzalo","11873436P");
		
		mec1.asignarCoche(coche1);
		mec1.mostrarInfo();
	}

}
