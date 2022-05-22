package Calculadora;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class CalculadoraMain {		

	public static void main(String[] args) {
				
		Scanner ent = new Scanner(System.in);
		int opcion = 0;
		float op1 = 0.0f, op2 = 0.0f;
				
		do {
			System.out.println("Selecciona una opcion \n" +
							
				"1�)suma \n" +
				"2�)resta \n" +
				"3�)multiplicacion \n" +
				"4�)division \n" +
				"5�)Operacion simple\n" +
				"6�)salir \n");
				
				opcion = ent.nextInt();
					
				
			if (opcion >=1 && opcion  <=4) {
					System.out.println("Introduce un numero");
					op1 = ent.nextFloat();
					System.out.println("Introduce un otro numero");
					op2 = ent.nextFloat();
			}
				
			switch (opcion) {
			
				case 1:
					sumar(op1, op2);
					break;
				case 2:
					restar(op1, op2);
					break;
				case 3:
					multiplicar(op1, op2);
					break;
				case 4:
					dividir(op1, op2);
					break;
				case 5: 
					
					System.out.println("Introduce una operaci�n simple, sin numeros negativos, letras o par�ntesis");
					ent.nextLine();
					String operacion = ent.nextLine();
					System.out.println(operacion);
					
					break;
				case 6:
					System.out.println("adios");
					break;
				default:
					System.out.println("valor incorrecto");
				
			}
				
		} while (opcion !=6);	
		
	}
	public static void sumar (float o1, float o2) {
		
		System.out.println(o1 + " + " + o2 + " = "+ (o1+o2));
				
	}
			
	public static void restar (float o1, float o2) {
					
		System.out.println(o1 + " + " + o2 + " = "+ (o1-o2));
					
	}
	public static void multiplicar (float o1, float o2) {
				
		System.out.println(o1 + " + " + o2 + " = "+ (o1*o2));
				
	}
			
	public static void dividir (float o1, float o2) {
				
		if (o2 !=0) {		
		System.out.println(o1 + " / " + o2 + " = "+ (o1/o2));
		}else { 
		System.out.println("la division por 0 no es posible");
		}
	}
}

