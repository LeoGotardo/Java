

import java.util.Scanner;

public class Catch_User {

   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in); 
      System.out.println("Digite um munero:");
      int numero = teclado.nextInt();
      if (numero >= 0) {
         int ehPar = num % 2;
         if (ehPar == 0) {
            System.out.println("O numero é par.");
         }
         else
            System.out.println("É impar.");
      }

   }

}
