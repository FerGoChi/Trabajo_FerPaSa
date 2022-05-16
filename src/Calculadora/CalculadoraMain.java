package Calculadora;

import java.util.Scanner;

public class CalculadoraMain {		

			public static void main(String[] args) {
				
				Scanner ent = new Scanner(System.in);
				int opcion = 0;
				float op1 = 0.0f, op2 = 0.0f;
				
				do {
					System.out.println("Selecciona una opcion \n" +
							
							"1º)suma \n" +
							"2º)resta \n" +
							"3º)multiplicacion \n" +
							"4º)division \n" +
							"5º)salir \n");
					
					opcion = ent.nextInt();
					
				
				if (opcion >=1 && opcion  <=4) {
				System.out.println("Introduce un numero");
				op1 = ent.nextFloat();
				System.out.println("Introduce un otro numero");
				op2 = ent.nextFloat();
				}
				
				switch (opcion) {
			
			case 1:
				System.out.println(op1 + " + " + op2 + " = "+ (op1+op2));
				break;
			case 2:
				System.out.println(op1 + " - " + op2 + " = "+ (op1-op2));
				break;
			case 3:
				System.out.println(op1 + " x " + op2 + " = "+ (op1*op2));
				break;
			case 4:
				if (op2 !=0)	{		
				System.out.println(op1 + " / " + op2 + " = "+ (op1/op2));
				}else { System.out.println("la division por 0 no es posible");
				
				}
			case 5:
				System.out.println("adios");
				break;
				default:
				System.out.println("valor incorrecto");
				
					}
				
				} while (opcion !=5);
				

	
	}

}
