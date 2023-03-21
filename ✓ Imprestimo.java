public class Salario {

   public static void main(String[] args) {
      Scanner salario = new Scanner(System.in);
      System.out.println("Digite o seu salario:");
      double num = salario.nextDouble();
      if (num >= 5*num) {
         System.out.println("OK");
      }
      else {
         System.out.println("WTF AMIGO VOCE ESTARE LOUCO?");
      }
   }
}
