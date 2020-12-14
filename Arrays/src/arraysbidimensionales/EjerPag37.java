package arraysbidimensionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjerPag37 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader (entrada);
		
		System.out.println("Introduce el número de filas:");
		int filas = Integer.parseInt(lectura.readLine());
		System.out.println("Introduce el número de columnas:");
		int col = Integer.parseInt(lectura.readLine());
		
		double temperaturas[][] = new double[filas][col];
		double max = 0;
		double min = 0;
		
		for (int i=0; i<temperaturas.length; i++) {
			for (int x=0; x<temperaturas[i].length; x++) {
				System.out.println("Introduce la temperatura nº "+(x+1)+", de la fila "+(i+1)+":");
				temperaturas[i][x] = Double.parseDouble(lectura.readLine());
				
				if (i==0 && x==0) {
					min = temperaturas[i][x];
				} else if (temperaturas[i][x] < min) {
					min = temperaturas[i][x];
				}
				
				if (temperaturas[i][x] > max) {
					max = temperaturas[i][x];
				}
			}
		}
		System.out.println("La temperatura máxima es: "+max);
		System.out.println("La temperatura mínima es: "+min);
	}

}
