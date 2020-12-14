package Arrays;

import java.util.Scanner;

public class act1T5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cont1 = 0, res = 0, mediap = 0, cont2 = 0, res1 = 0, mediai = 0;
		
		int [] num = new int [10];
		
		for (int cont = 0 ; cont < num.length; cont++) {
			
			System.out.println("Dame un número");
			num [cont] = sc.nextInt();
			
			if (num [cont] % 2 == 0) {
				cont1 = cont1 + 1;
				res = res + num [cont];
				mediap = res / cont1;
			}
			else {
				cont2++;
				res1 = res1 + num [cont];
				mediai = res1 / cont2;
				
			}
			
		}
		
		System.out.println("La media de los números pares es: " + mediap);
		System.out.println("La media de los números impares es: " + mediai);
		
		
		sc.close();

	}

}
