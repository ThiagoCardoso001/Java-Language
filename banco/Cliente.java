import java.util.ArrayList;

public class Cliente
{
    private String nome;
    private double salario;
    private ArrayList<Conta> minhasContas;

    public Cliente(){
        minhasContas = new ArrayList<>();
    }
    
    public double saldoTotalContas(){
        double total = 0;
        for(Conta c : minhasContas){
            total += c.getSaldo();
        }
        return total;
    }
    
    public ArrayList<Conta> getMinhasContas(){
        return minhasContas;
    }
    
    public void addConta(Conta ct){
        minhasContas.add(ct);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    
}
