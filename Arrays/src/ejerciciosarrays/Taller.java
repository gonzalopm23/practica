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
			System.out.println("Introduce la matricula del coche nº "+i);
			String matricula = lectura.readLine();
			System.out.println("Introduce el color del coche nº "+i);
			String color = lectura.readLine();
			System.out.println("Introduce el año de fabricación del coche nº "+i);
			int año = Integer.parseInt(lectura.readLine());
			System.out.println("Introduce el precio del coche nº "+i);
			double precio = Double.parseDouble(lectura.readLine());
			arrayCoches[i] = new Coche(matricula,color,precio,año);
		}
		
		do {
			System.out.println("Introduce la operación a realizar:"
					+"\na. Mostrar información de coches fabricados anteriormente a un año determinado"
					+"\nb. Mostrar información de coches de un color deteminado"
					+"\nc. Mostrar información de coches en un rango de precio determinado"
					+"\nd. Salir");
			opcion = lectura.readLine();
			switch(opcion) {
				case "a":
					mostrarPorAño(arrayCoches);
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
					System.out.println("Opción incorrecta, introduce una opción válida.");
			}
		} while(!opcion.equals("d"));
	}
	
	public static void mostrarPorAño(Coche coches[]) throws NumberFormatException, IOException {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader (entrada);
		
		System.out.println("Introduce el año de fabricación máximo a buscar:");
		int año = Integer.parseInt(lectura.readLine());
		
		for (int i=0; i<coches.length; i++) {
			if (coches[i].getAño() <= año) {
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
		System.out.println("INFORMACIÓN COCHE:"
				+"\nMatricula: "+coche.getMatricula()
				+"\nColor: "+coche.getColor()
				+"\nPrecio: "+coche.getPrecio()
				+"\nAño: "+coche.getAño()+"\n");
	}

}
