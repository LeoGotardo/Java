public class Nota {

   public static void main(String[] args) {
      Scanner nota = new Scanner(System.in);
      System.out.println("Digite o seu salario:");
      int num = nota.nextInt();
      if (num == 10) {
         System.out.println("Nice (Conceito A");
      }
      else if(num > 7 && num < 10 ) {
         System.out.println("Quase (Conceito B)");
      }
      else if(num > 5 && num < 8) {
         System.out.println("Safe (Conceito C");
      }
      else if(num > 2 && num < 5) {
         System.out.println("Paia (Conceito D");
      }
      else if(num < 3) {
         System.out.println("KKKKKKKK");
      }
   }
}
