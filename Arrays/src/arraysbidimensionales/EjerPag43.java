package arraysbidimensionales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjerPag43 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader (entrada);
		
		double nivelesCo2[][] = new double[5][0];
		
		for (int i=0; i<nivelesCo2.length; i++) {
			System.out.println("¿De cuantos días tenemos datos en la semana nº "+(i+1)+"?");
			int cols = Integer.parseInt(lectura.readLine());
			nivelesCo2[i] = new double[cols];
			
			for (int x=0; x<nivelesCo2[i].length; x++) {
				System.out.println("Introduce el nivel de CO2 del día nº "+(x+1)+", de la semana nº "+(i+1)+":");
				double co2 = Double.parseDouble(lectura.readLine());
				nivelesCo2[i][x] = co2;
			}
		}
		
		mostrarDatos(nivelesCo2);
	}
	
	private static void mostrarDatos(double matriz[][]) {
		for (int i=0; i<matriz.length; i++) {
			for (int x=0; x<matriz[i].length; x++) {
				System.out.print(matriz[i][x] + " ");
			}
			System.out.println("");
		}
	}

}
