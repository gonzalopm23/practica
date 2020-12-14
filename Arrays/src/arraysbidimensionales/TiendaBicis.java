package arraysbidimensionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TiendaBicis {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader (entrada);
		
		System.out.println("Introduce el número de filas de bicis:");
		int filas = Integer.parseInt(lectura.readLine());
		System.out.println("Introduce el número de columnas de bicis:");
		int cols = Integer.parseInt(lectura.readLine());
		
		Bici arrayBicis[][] = new Bici[filas][cols];
		rellenarMatriz(arrayBicis);
		
		System.out.println("Introduce la posición de la bici a pintar: \nFila:");
		int posFila = Integer.parseInt(lectura.readLine());
		System.out.println("Columna:");
		int posCol = Integer.parseInt(lectura.readLine());
		pintarBici(arrayBicis[posFila][posCol]);
		
		for (int i=0; i<arrayBicis.length; i++) {
			for (int x=0; x<arrayBicis[i].length; x++) {
				arrayBicis[i][x].mostrarInfo();
			}
		}
		
		/* #1 RELLENAR EL ARRAY CON BICIS
		 	for (int i=0; i<arrayBicis.length; i++) {
				for (int x=0; x<arrayBicis[i].length; x++) {
				System.out.println("Datos para la bici de la fila nº "+(i+1)+", columna nº "+(x+1)+":");
				System.out.println("Identificador:");
				String id = lectura.readLine();
				System.out.println("Color:");
				String color = lectura.readLine();
				System.out.println("Marca:");
				String marca = lectura.readLine();
				System.out.println("Precio:");
				double precio = Double.parseDouble(lectura.readLine());
				
				arrayBicis[i][x] = new Bici(id,color,marca,precio);
			}
		}*/
	
		/* #1 BUSCAR CUANTAS BICIS HAY DE UN COLOR Y CUANTAS HAY DE ALTA GAMA
		System.out.println("\nIntroduce el color a buscar:");
		String color = lectura.readLine();
		int nbicisColor = 0;
		int nbicisAltaGama = 0;
		
		for (int i=0; i<arrayBicis.length; i++) {
			for (int x=0; x<arrayBicis[i].length; x++) {
				if ((arrayBicis[i][x].getColor()).equals(color)) {
					nbicisColor++;
				}
				if (arrayBicis[i][x].getPrecio() > 1500) {
					nbicisAltaGama++;
				}
			}
		}
		System.out.println("Hay "+nbicisColor+" bicis de color "+color+".");
		System.out.println("Hay "+nbicisAltaGama+" bicis de alta gama.");*/	
	}
	
	private static void pintarBici(Bici inBici) throws IOException {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader (entrada);
		
		System.out.println("¿De qué color la quieres pintar?");
		String color = lectura.readLine();
		inBici.setColor(color);
	}
	
	private static void rellenarMatriz(Bici[][] miMatriz) throws IOException {
		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader (entrada);
		
		System.out.println("Datos para la bici:");
		System.out.println("Identificador:");
		String id = lectura.readLine();
		System.out.println("Color:");
		String color = lectura.readLine();
		System.out.println("Marca:");
		String marca = lectura.readLine();
		System.out.println("Precio:");
		double precio = Double.parseDouble(lectura.readLine());
		Bici biciCopiar = new Bici(id,color,marca,precio);
		
		for (int i=0; i<miMatriz.length; i++) {
			for (int x=0; x<miMatriz[i].length; x++) {
				miMatriz[i][x] = new Bici(biciCopiar);
			}
		}
	}

}
