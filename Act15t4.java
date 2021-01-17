package Funciones;

import java.util.Scanner;

public class Act15t4 {
	
	public static void numCuadrado (int altura) {
		
		int cont2 = 1;
	
		for (int cont = 1; cont <= altura; cont++) {
			for (int cont1= 1; cont1 < altura ; cont1++ ) {
				System.out.print(cont2);
			}
			System.out.println(cont);
			
			cont2++;
		}
			
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int altura;
		
		System.out.println("Dame la altura del cuadrado");
		altura = sc.nextInt();
		
		numCuadrado(altura);

	}

}
