/*
Verifica se o numero Digitado pelo usuario é impar ou par
*/

import java.util.Scanner;

public class Catch_User {

   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in); 
      System.out.println("Digite um munero:");
      int num = teclado.nextInt();
      if (num>= 0) {
         int ehPar = num % 2;
         if (ehPar == 0) {
            System.out.println("O numero é par.");
         }
         else
            System.out.println("É impar.");
      }

   }

}
