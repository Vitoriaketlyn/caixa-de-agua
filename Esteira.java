import javax.swing.JOptionPane;
public class Esteira{
  // atributo variavel normal
    boolean estado;
  // metodo
  void ligar(){
    estado = true;
    JOptionPane.showMessageDialog(null, "Esteira ligada");
    
  }
   void desligar(){
     estado = false;
     JOptionPane.showMessageDialog(null, "Esteira desligada");
   }
   void entrega(){
     JOptionPane.showMessageDialog(null, "Entrega feita");
    }

}