
public class Poupanca extends Conta
{    
    private double taxaJuros;
    
    //Vou errar na prova!!!!!!!
    public Poupanca(){
        this("123");
    }
    public Poupanca(String numero){
        super(numero);
    }
    
    //redimento devera somar taxaJuros em % ao saldo
    public void rendimento(){
         depositar( getSaldo() * taxaJuros );
    }
    public void rendimento2(){
         this.saldo *= taxaJuros;
    }

    public double getTaxaJuros(){
        return taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros){
        this.taxaJuros = taxaJuros;
    }
    
}
