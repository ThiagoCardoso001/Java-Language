import java.util.ArrayList;
public class Banco
{
    private String nome;
    private ArrayList<Conta> contas;
    
    public Banco(){
        contas = new ArrayList<>();
    }
    
    public Cliente getClienteMaiorSaldo(){
        
        Conta contaMaiorSaldo = contas.get(0);
        
        for(int i = 1; i < contas.size(); i++){            
            if (contas.get(i).getSaldo() > contaMaiorSaldo.getSaldo() ){
               contaMaiorSaldo = contas.get(i); 
            }
        }
        /*
        for (Conta c : contas){
            if (c.getSaldo() > contaMaiorSaldo.getSaldo() ){
               contaMaiorSaldo = c; 
            }            
        }   */     
        //return contaMaiorSaldo.getTitular().getNome();
        return contaMaiorSaldo.getTitular();
        
    }
    
    public ArrayList<Conta> getContas(){
        return contas;
    }
    
    public void addConta(Conta ct){
        contas.add(ct);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
