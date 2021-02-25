import java.util.Scanner;

public class contarPalabras {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Dame una frase");
		String frase = sc.nextLine();
		String[] result = frase.split("\\s");
	     for ( x=0; x<result.length; x++) {	 
	     }
	     
	     System.out.println("Se han contado " + x + " palabras");
	        

	}

}
