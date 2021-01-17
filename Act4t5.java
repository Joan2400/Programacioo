package Arrays;

import java.util.Scanner;

public class Act4t5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num [] = new int [10];
		int positivo = 0, negativo = 0, ceros = 0;
		
		for (int cont = 0; cont < num.length; cont++) {
			
			System.out.println("Dame un número");
			num[cont] = sc.nextInt();
			
			if (num [cont] > 0) {
				
				positivo++;
				
			}
			else if (num [cont] == 0) {
				
			ceros++;
				
				
			}
			else {
				negativo++;
			}
		}
		
		System.out.println("Hay " + positivo + " positivos");
		System.out.println("Hay " + ceros + " ceros");
		System.out.println("Hay " + negativo + " negativo");
		

	}

}
