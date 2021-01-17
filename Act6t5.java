package Arrays;

import java.util.Scanner;

public class Act6t5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] numerosAleatorios = new int [10];
		int cont2 = 0;
		
		for (int cont = 0; cont < numerosAleatorios.length; cont++) {
			
			numerosAleatorios[cont] = (int) (Math.random()*25+1);
			
			System.out.println("El número aleatorio guardado en la posición " + cont2 + "=" + numerosAleatorios[cont]);
			cont2++;
		}

	}

}
