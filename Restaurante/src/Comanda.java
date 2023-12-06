
import javax.swing.JOptionPane;


public class Comanda {
    private int Mesa;
    private double ValorConsumo;
    private double ValorEstacionamento;
    private double ValorCouvert;
    private double ValorDescontoPromocional;
    private double ValorTotal;

    public Comanda() {
        this(0,0.0,0.0,0.0,0.0,0.0);
    }

    public Comanda(int Mesa, double ValorConsumo, double ValorEstacionamento, double ValorCouvert, double ValorDescontoPromocional, double ValorTotal) {
        this.Mesa = Mesa;
        this.ValorConsumo = ValorConsumo;
        this.ValorEstacionamento = ValorEstacionamento;
        this.ValorCouvert = ValorCouvert;
        this.ValorDescontoPromocional = ValorDescontoPromocional;
        this.ValorTotal = ValorTotal;
    }

    public int getMesa() {
        return Mesa;
    }

    public void setMesa(int Mesa) {
        this.Mesa = Mesa;
    }

    public double getValorConsumo() {
        return ValorConsumo;
    }

    public void setValorConsumo(double ValorConsumo) {
        this.ValorConsumo = ValorConsumo;
    }

    public double getValorEstacionamento() {
        return ValorEstacionamento;
    }

    public void setValorEstacionamento(double ValorEstacionamento) {
        this.ValorEstacionamento = ValorEstacionamento;
    }

    public double getValorCouvert() {
        return ValorCouvert;
    }

    public void setValorCouvert(double ValorCouvert) {
        this.ValorCouvert = ValorCouvert;
    }

    public double getValorDescontoPromocional() {
        return ValorDescontoPromocional;
    }

    public void setValorDescontoPromocional(double ValorDescontoPromocional) {
        this.ValorDescontoPromocional = ValorDescontoPromocional;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }
     public void LancarGastos(){
     setMesa(Integer.parseInt(JOptionPane.showInputDialog("Numero Mesa:")));
     setValorConsumo(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor Consumo:")));
     setValorEstacionamento(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor Estacionamento:")));
     setValorCouvert(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor Couvert:")));
     setValorDescontoPromocional(Double.parseDouble(JOptionPane.showInputDialog("Digite Valor Desconto Promocional:")));
    
     }
     
     public void VerificarPromocao(){
     if (this.getValorConsumo()>100)
         this.setValorDescontoPromocional(this.getValorConsumo()*0.10);
         JOptionPane.showMessageDialog(null, "Valor desconto promocional e:"+getValorDescontoPromocional());
     }
     
     public void ListarComanda(){
    JOptionPane.showMessageDialog(null,"\nMesa:"+ getMesa()+"\nValor Comsumo:"+getValorConsumo()+"\nValor Estacionamento:"+getValorEstacionamento()+"\nValor Couvert:"+getValorCouvert()+"\nValor Desconto Promocional:"+getValorDescontoPromocional()+"\nValorTotal:"+getValorTotal());
     }
     
     public  double TotalizarComanda(){
    
        setValorTotal (this.getValorConsumo()+getValorEstacionamento()+getValorCouvert()-getValorDescontoPromocional());
        return getValorTotal();
     }
}
