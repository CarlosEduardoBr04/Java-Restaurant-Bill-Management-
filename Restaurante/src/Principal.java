
import javax.swing.JOptionPane;


public class Principal {

    
    public static void main(String[] args) {
    Comanda controleMesa = new Comanda();
          
 int op;
      double a,b;
      
      do{
          op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao \n" + "\n 1- Lancar Gastos \n 2- Verificar Promocao \n 3- Fechar Mesa \n 4- Listar Comanda \n 0- Sair" ));

          switch (op)
          {
            case 1:
              controleMesa.LancarGastos();
              break;
            case 2:
              controleMesa.VerificarPromocao();
              break;
            case 3:
                controleMesa.TotalizarComanda();
                break;
             case 4:
                controleMesa.ListarComanda();
                break;
            case 0:
             JOptionPane.showMessageDialog(null,"A Finalizar Programa");
              break;
              default:
              JOptionPane.showMessageDialog(null,"Opcao Invalida");
              break;
          }
      } while(op!=0);
    }
    
}
    

