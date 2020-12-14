package Arrays;

import java.util.Scanner;

public class act0T5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mediap = 0, median= 0, cont1 = 0, res = 0, cont2 = 0, res1 = 0;
		
		int [] temps = new int [10];
		
		for (int cont = 0;cont < temps.length; cont++ ) {
			
			System.out.println("Dame la temperatura");
			temps [cont] = sc.nextInt();
			
			if (temps [cont] > 0) {
				cont1 = cont1 + 1;
				res = res + temps [cont];
				mediap = res / cont1;
			}
			else {
				cont2 = cont2 + 1;
				res1 = res1 + temps [cont];
				median = res1 / cont2;
				
			}
		}
		
		System.out.println("La media de las temperaturas positivas son: " + mediap);
		System.out.println("La media de las temperaturas negativas es de: " + median);
		
		
		
		
		sc.close();

	}

}
