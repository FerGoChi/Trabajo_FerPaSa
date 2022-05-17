package Calculadora;

import java.util.Scanner;

public class CalculadoraMain {		

		public static void main(String[] args) {
				
			Scanner ent = new Scanner(System.in);
			int opcion = 0;
			float op1 = 0.0f, op2 = 0.0f;
				
			do {
				System.out.println("Selecciona una opcion \n" +
							
						"1º)Suma \n" +
						"2º)Resta \n" +
						"3º)Multiplicacion \n" +
						"4º)Division \n" +
						"5º)Salir \n");
					
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
						System.out.println("adiós");
						break;
					
					default:
					System.out.println("valor incorrecto");
						
				}
				
			} while (opcion !=5);
				

			
	
	}
		public static void sumar (float o1, float o2) {
			
			System.out.println("La suma de " + o1 + " + " + o2 + " = "+ (o1+o2));
					
		}
				
		public static void restar (float o1, float o2) {
						
			System.out.println("La resta de: " + o1 + " - " + o2 + " = "+ (o1-o2));
						
		}
		public static void multiplicar (float o1, float o2) {
					
			System.out.println("La multiplicación de: " + o1 + " * " + o2 + " = "+ (o1*o2));
					
		}
				
		public static void dividir (float o1, float o2) {
					
			if (o2 !=0) {		
				System.out.println("La división de: " + o1 + " / " + o2 + " = "+ (o1/o2));
			}else { 
				System.out.println("La division por 0 no es posible");
			}
		}

}
