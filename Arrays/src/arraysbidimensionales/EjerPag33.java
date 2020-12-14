package arraysbidimensionales;

public class EjerPag33 {

	public static void main(String[] args) {

		double temperaturas[][] = {
				{30.2,16.1,20},
				{25.6,10,5,18.4},
				{34,20.3,28.6},
				{40.5,10.4,30.6},
				{30.4,15.7,20},
				{20.4,9,13.4},
				{35,19.5,30.4}}; 
		
		char sopaLetras[][] = {
			{'v','g','y','p','p'},
			{'x','n','o','b','e'},
			{'t','j','ñ','n','r'},
			{'a','m','k','p','e'},
			{'m','o','r','o','z'}};
		
		System.out.println(sopaLetras[0][1]+" "+sopaLetras[1][2]+" "+sopaLetras[2][3]);
		System.out.println(temperaturas[6][2]);
	}

}
