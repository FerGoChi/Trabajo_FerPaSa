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
						
					}else { 
						System.out.println("la division por 0 no es posible");
					 }
					break;
				case 5: 
					
					System.out.println("Introduce una operación simple, sin numeros negativos, letras o paréntesis");
					ent.nextLine();
					String operacion = ent.nextLine();
					operacion = calcStr(operacion);
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
			

	
	
	
	
			static public String calcStr(String operacion) {
				try {	
					float n1 = 0, n2 = 0;
					int index=0, op = 0;
					String split[] = null;
					
					if(operacion.contains("/") || operacion.contains("*")) {
						split = operacion.split("\\+|\\-");
						
						for(index = 0 ; index<split.length; index++) {
							
							if(split[index].length()>1) {
								
								String subSplit[] = split[index].split("\\*|\\/");
								ArrayList<Character> subOperadores = new ArrayList<Character>();
								getOperadores(split[index], subOperadores);
								
								n1 = Float.parseFloat(subSplit[0]);
								op = 0;
								n2 = 0;
								
								for(int r = 1 ; r<subSplit.length ; r++) {
									
									n2 = Float.parseFloat(subSplit[r]);
									
									switch (subOperadores.get(op)) {
									
									
										case '+' -> n1 = (n1 + n2);
										case '-' -> n1 = (n1 - n2);
										case '*' -> n1 = (n1 * n2);
										case '/' -> n1 = (n1 / n2);
									}
								
									op++;
								}
						
								operacion = operacion.replaceFirst("\\Q"+split[index]+"\\E", String.valueOf(n1)); 
								
							}
						}
						
						operacion = calcBajaPrioridad(operacion, split, n1, n2, op);
					}
					
					else {
						
						operacion = calcBajaPrioridad(operacion, split, n1, n2, op);
						
					}
							
					operacion = "Reesultado de la operacion: "+operacion+"\n";
					return operacion;
					
				}catch(NumberFormatException ex) {
					return operacion = "Esta opción solo acepta operaciones simples (Suma, resta, multiplicación, División.\n"
							+ "No se aceptan números negativos, parentesis o letras.\n";
				}
			}
			
			static public void getOperadores(String operacion, ArrayList<Character> operadores ){		
				for(int i = 0; i<operacion.length(); i++) {
		
					if(operacion.charAt(i)=='*' || operacion.charAt(i)=='/' ||
					   operacion.charAt(i)=='+' || operacion.charAt(i)=='-') {
						
						operadores.add(operacion.charAt(i));	
						
					}
				}
			}
			
			static public String calcBajaPrioridad(String operacion, String split[], float n1, float n2, int op){
				split = operacion.split("\\+|\\-");
				ArrayList<Character> operadores = new ArrayList<Character>();
				getOperadores(operacion, operadores);
				
				n1 = Float.parseFloat(split[0]);
				op = 0;
				n2 = 0;
				
				for (int i = 1; i < split.length ; i++) {

					n2 = Float.parseFloat(split[i]);
					
					switch (operadores.get(op)) {
					
					
						case '+' -> n1 = (n1 + n2);
						case '-' -> n1 = (n1 - n2);
						case '*' -> n1 = (n1 * n2);
						case '/' -> n1 = (n1 / n2);
					}
					
					op++;
					
				}
				return operacion = ""+n1+"";
			
			}
			

}
