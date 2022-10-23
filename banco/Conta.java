
public class Conta
{    
    private String numero;
    protected double saldo;
    private Cliente titular;
    private Banco banco;
        
    public Conta(String numero){
        this.numero = numero;
        this.saldo = 0;
    }
    
    public Banco getBanco(){
        return banco;
    }
    public void setBanco(Banco banco){
        this.banco = banco;
    }
    
    public void depositar(double valor){
        if (valor > 0){
          saldo += valor;
        }
    }
    
    public void sacar(double valor){
        if ((valor > 0) && (valor <= saldo)){
          saldo -= valor;
        }
    }
    
    public String toString(){
        return "Cliente: "+titular.getNome()+", conta: "
        +numero+", saldo: R$"+saldo;
    }
    
    public Cliente getTitular(){
        return titular;
    }
    public void setTitular(Cliente titular){
        this.titular = titular;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getNumero(){
        return numero;
    }
    
    public double getSaldo(){
        return saldo;
    }
}
