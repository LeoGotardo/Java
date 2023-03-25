public class metodos
{
    String nome;
    boolean completo;
    int id;
    double pi;
  
  public metodos(String nome)
  {
    this.nome = nome;
  }
  
  public metodos(String nome,boolean completo, int id, double pi)
  {
    this.nome = nome;
    this.completo = completo;
    this.id = id;
    this.pi = pi;
  }
  
  void imprimir()
  {
    System.out.println("Nome:"+nome);
  }
}