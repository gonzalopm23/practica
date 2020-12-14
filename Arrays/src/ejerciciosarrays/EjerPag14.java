package ejerciciosarrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjerPag14 {

	public static void main(String[] args) throws IOException {

		InputStreamReader entrada = new InputStreamReader(System.in);
		BufferedReader lectura = new BufferedReader (entrada);
		
		System.out.println("Introduce el número de alumnos:");
		int numAlum = Integer.parseInt(lectura.readLine());
		Alumno alumnos[] = new Alumno[numAlum];
		double total = 0;
		
		for (int i=0; i<alumnos.length; i++) {
			System.out.println("Inroduce el nombre del alumno nº "+i+":");
			String nombre = lectura.readLine();
			System.out.println("Inroduce el dni del alumno nº "+i+":");
			String dni = lectura.readLine();
			System.out.println("Inroduce la nota del alumno nº "+i+":");
			double nota = Double.parseDouble(lectura.readLine());
			total += nota;
			
			alumnos[i] = new Alumno(nota,dni,nombre);
		}
		
		double media = calcularMedia(total,numAlum);
		System.out.println("La nota media de la clase es: "+media);
		mostrarAlumnosConBuenasNotas(alumnos,media);
	}
	
	
	
	public static double calcularMedia(double total, int numAlum) {
		double media = total/numAlum;
		return media;
	}
	
	public static void mostrarAlumnosConBuenasNotas(Alumno alumnos[], double media) {
		System.out.println("ALUMNOS CON NOTA POR ENCIMA DE LA MEDIA:");
		for (int i=0; i<alumnos.length; i++) {
			if (alumnos[i].getNota() > media) {
				System.out.println(alumnos[i].getNombre()+", nota: "+alumnos[i].getNota());
			}
		}
	}

}
