package Arrays;

import java.util.Scanner;

public class act2T5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cont1 = 0, median = 0, res = 0;

		int [] notas = new int [12];

		for (int cont = 0; cont < notas.length; cont++) {

			System.out.println("Dame la nota");
			notas [cont] = sc.nextInt();

			cont1++;
			res = res + notas [cont];
			median = res / cont1;

		}
		System.out.println("La media de las notas es: " + median);
		System.out.println("Las notas superiores a la media son:");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > median) {
				System.out.println("Alumno numero " + (i + 1)+ " Nota: " + notas[i]);
			}
		}



		sc.close();

	}

}
