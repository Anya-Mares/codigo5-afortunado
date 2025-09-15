package codigo5;

import java.util.Scanner;//faltaban imports 
/** 
 * El programa te pide que incertes un número.
 * Se considera afortunado si tiene 3,7,8,9 dígitos.
 * 
 * Se agregó método main.
 * Se agregó import scanner.
 * se corrigieron comilla es print.
 * Se cambió el string por int .
 * Se agregó la letra faltante en el println final .
 * se movieron las llaves de if y while.
 * Se agregó un sc.close(); .
 * */
public class codigo5 {
	public static void main (String[] args) {//no lo tenía 
		
	Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca un número: ");//tenia comilla simple y doble 
    
    int ni = sc.nextInt();//había un String por aquí
    int c = ni;
    int afo = 0;
    int noAfo = 0;
    
    while (ni > 0) {
	  int digito = (int)(ni % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
		}//else
      
      ni /= 10; //lo movi para que no sea infinito 
	 
    }//while
      
    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado.");//faltaba una letra 
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }
    sc.close();//para que se detenga , eclipse me pidio que lo hiciera
  }//main
  
}//class codigo5

