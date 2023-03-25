class Main
{
  public static void main(String[] args)
  {
    metodos met1 = new metodos("Metodo 1");
    met1.imprimir();
    
    metodos met2 = new metodos("Metodo 2", true, 2, 3.14159);
    met2.imprimir(); 
  }
}