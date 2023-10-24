public class Principal{

  public static void main(String[] args){
    Esteira esteira = new Esteira();

    Caixa caixa = new Caixa(esteira);

    caixa.addGarrafas();
    caixa.addGarrafas();
    caixa.addGarrafas();
 }
}