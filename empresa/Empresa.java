import java.util.ArrayList;

public class Empresa
{    
    private String nome;
    //private Funcionario[] funcionarios;
    private ArrayList<Funcionario> funcionarios;
    
    public Empresa(){
        funcionarios = new ArrayList<Funcionario>();
    }
    
    public double totalSalarios(){
        double soma = 0;
        for(int count = 0; count<funcionarios.size(); count++)
        {
            soma += funcionarios.get(count).salario();
        }
        /* for(Funcionaro f: funcionarios)
         * {
         *     soma += f.salario();
         *  }*/
        return soma;
    }
    
    public void setNome(String nome) {
        if(nome != null && !nome.equals("")) {
            this.nome = nome;
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void addFuncionario(Funcionario func) {
        this.funcionarios.add(func);
    }
    
    public void delFuncionarios(Funcionario func) {
        this.funcionarios.remove(func);
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
}
