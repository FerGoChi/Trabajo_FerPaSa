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
					"5º)Operacion simple\n" +
					"6º)salir \n");

					opcion = ent.nextInt();


					if (opcion >=1 && opcion  <=4) {
					System.out.println("Introduce un numero");
					op1 = ent.nextFloat();
					System.out.println("Introduce un otro numero");
					op2 = ent.nextFloat();
					}
					
					switch (opcion) {

					case 1:
						sumar(op1,op2);
					break;
					case 2:
						restar(op1,op2);
					break;
					case 3:
						multiplicar(op1,op2);
					break;
					case 4:
						dividir(op1,op2);
					break;
					case 5:

					System.out.println("Introduce una operación simple, sin numeros negativos, letras o paréntesis");
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

