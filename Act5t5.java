package Arrays;

import java.util.Scanner;

public class Act5t5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] empleados = new String[10];
		int[] sueldos = new int[10];
		 int cont = 0;
		 int mayorSueldo;
		 String nombreMayor;

                                       
	        System.out.print("Empleado " + (cont + 1) + ": ");
	        empleados[cont] = sc.nextLine();
	        System.out.print("Sueldo: ");
	        sueldos[cont] = sc.nextInt();

	       
	        mayorSueldo = sueldos[cont];
	        nombreMayor = empleados[cont];

	      
	        for (cont = 1; cont < empleados.length; cont++) {
	            sc.nextLine(); 
	            System.out.print("Empleado " + (cont + 1) + ": ");
	            empleados[cont] = sc.nextLine();
	            System.out.print("Sueldo: ");
	            sueldos[cont] = sc.nextInt();
	         
	            if (sueldos[cont] > mayorSueldo) {
	                mayorSueldo = sueldos[cont];
	                nombreMayor = empleados[cont];
	            }
	        }

	        System.out.println("Empleado con mayor sueldo: " + nombreMayor );                                         
	        System.out.println("Sueldo: " + mayorSueldo);
	}

}
