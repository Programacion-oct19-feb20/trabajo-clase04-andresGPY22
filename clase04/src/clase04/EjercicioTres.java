/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjercicioTres {
 /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso d nombres completos de un estudiante
    ingreso de nota 1(debe ser entero)
    ingreso de nota 2(debe ser entero)
    ingreso del ciclo al que cursa el alumno (debe ser cadena)
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Informe del alumno:
    Nombres Completos:
    Ciclo:
    Nota 1:
    NOTA 2:
    */ 
     public static void main(String[]args){
       Scanner entrada = new Scanner(System.in);
       
      String nombres;
      int nota1;
      int nota2;
      String ciclo;
      
      System.out.println("Ingrese sus nombres completo");
      nombres = entrada.nextLine();
      System.out.println("Ingrese su Nota 1");
      nota1 = entrada.nextInt();
      System.out.println("Ingrese su nota 2");
      nota2 = entrada.nextInt();
      entrada.nextLine();
      System.out.println("Ingrese su ciclo que cursa");
      ciclo = entrada.nextLine();
      
      System.out.printf("Informe del Alumno:\nNombres Completos: %s\nCiclo: %s\nNota 1: %d\nNota 2: %d\n", nombres, ciclo, nota1, nota2);
       
   
}
}
