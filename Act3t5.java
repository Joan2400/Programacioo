package Arrays;

import java.util.Scanner;

public class Act3t5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pares [] = new int [20];
		int par = 0;
		
		for (int cont = 0; cont < pares.length; cont++) {
			
			pares [cont] = par;
			
			par = par + 2;
			
			System.out.println(pares [cont]);
			
		}
		
		
		

	}

}
