
public class ContaCorrente extends Conta
{
    private double limiteCredito;
    
    public ContaCorrente(String conta, double limiteCredito){
        super(conta);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor){
         if ( valor <= (getSaldo()+limiteCredito) ){
             saldo -= valor;
         }
    }
    
    public double getLimiteCredito(){
        return limiteCredito;
    }
    public void setLimiteCredito(double limiteCredito){
        this.limiteCredito = limiteCredito;
    }
}
