package ejerciciosarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taller {

	public static void main(String[] args) throws IOException {

		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader (entrada);
		
		System.out.println("Introduce el numero de coches del taller:");
		int numCoches = Integer.parseInt(lectura.readLine());
		Coche arrayCoches[] = new Coche[numCoches];
		String opcion = "";
		
		for (int i=0; i<arrayCoches.length; i++) {
			System.out.println("Introduce la matricula del coche n� "+i);
			String matricula = lectura.readLine();
			System.out.println("Introduce el color del coche n� "+i);
			String color = lectura.readLine();
			System.out.println("Introduce el a�o de fabricaci�n del coche n� "+i);
			int a�o = Integer.parseInt(lectura.readLine());
			System.out.println("Introduce el precio del coche n� "+i);
			double precio = Double.parseDouble(lectura.readLine());
			arrayCoches[i] = new Coche(matricula,color,precio,a�o);
		}
		
		do {
			System.out.println("Introduce la operaci�n a realizar:"
					+"\na. Mostrar informaci�n de coches fabricados anteriormente a un a�o determinado"
					+"\nb. Mostrar informaci�n de coches de un color deteminado"
					+"\nc. Mostrar informaci�n de coches en un rango de precio determinado"
					+"\nd. Salir");
			opcion = lectura.readLine();
			switch(opcion) {
				case "a":
					mostrarPorA�o(arrayCoches);
					break;
				case "b":
					mostrarPorColor(arrayCoches);
					break;
				case "c":
					mostrarPorPrecio(arrayCoches);
					break;
				case "d":
					System.out.println("Programa finalizado.");
					break;
				default:
					System.out.println("Opci�n incorrecta, introduce una opci�n v�lida.");
			}
		} while(!opcion.equals("d"));
	}
	
	public static void mostrarPorA�o(Coche coches[]) throws NumberFormatException, IOException {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader (entrada);
		
		System.out.println("Introduce el a�o de fabricaci�n m�ximo a buscar:");
		int a�o = Integer.parseInt(lectura.readLine());
		
		for (int i=0; i<coches.length; i++) {
			if (coches[i].getA�o() <= a�o) {
				mostrarInfo(coches[i]);
			}
		}
	}
	
	public static void mostrarPorColor(Coche coches[]) throws NumberFormatException, IOException {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader (entrada);
		
		System.out.println("Introduce el color de coche a buscar:");
		String color = lectura.readLine();
		boolean control = false;
		
		for (int i=0; i<coches.length; i++) {
			if ((coches[i].getColor()).equals(color)) {
				mostrarInfo(coches[i]);
				control = true;
			}
		}
		
		if (!control) {
			System.out.println("No tenemos coches de ese color.\n");
		}
	}
	
	public static void mostrarPorPrecio(Coche coches[]) throws NumberFormatException, IOException {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader (entrada);
		
		System.out.println("Introduce el rango de precio a buscar:\nPrecio minimo:");
		double precioMin = Double.parseDouble(lectura.readLine());
		System.out.println("Precio maximo:");
		double precioMax = Double.parseDouble(lectura.readLine());
		
		for (int i=0; i<coches.length; i++) {
			if (coches[i].getPrecio() >= precioMin && coches[i].getPrecio() <= precioMax) {
				mostrarInfo(coches[i]);
			}
		}
	}
	
	public static void mostrarInfo(Coche coche) {
		System.out.println("INFORMACI�N COCHE:"
				+"\nMatricula: "+coche.getMatricula()
				+"\nColor: "+coche.getColor()
				+"\nPrecio: "+coche.getPrecio()
				+"\nA�o: "+coche.getA�o()+"\n");
	}

}
