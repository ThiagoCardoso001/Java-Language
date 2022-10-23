import java.util.Scanner;

public class Principal
{
  static Scanner le = new Scanner(System.in);
  
  public static void main(String args[]){
  
      Empresa emp = new Empresa();
      cadastrarEmpresa(emp);
      
      while(true) {
        //Cadastrar funcionario
        Funcionario func = cadastrarFuncionario();
        emp.addFuncionario(func);
        
        System.out.println("Deseja sair (S)im ou (N)ao?");
        if(le.next().equalsIgnoreCase("s")){
            break;
        }
    }
    System.out.println("A empresa "+emp.getNome() + 
        " possui " + emp.getFuncionarios().size() +" funcionarios, total gasto R$ "
            +emp.totalSalarios());
  }
  
  public static void cadastrarEmpresa(Empresa emp){
    System.out.println("Informe o nome da empresa: ");
    emp.setNome(le.next());
}

 public static Funcionario cadastrarFuncionario(){
      Funcionario f = new Funcionario();
          System.out.println("Informe o nome do funcionario:");
          f.setNome(le.next());
          System.out.println("Informe o salario-base");
          f.setSalarioBase(le.nextDouble());
          System.out.println("Informe o numero de filhos:");
          f.setNumeroFilhos(le.nextInt());
          System.out.println("Informe se usa o vale-transporte:");
          f.setUsaValeTransporte(le.nextBoolean());
          System.out.println("Informe se trabalha a noite (S)im ou Nao:");
          f.setTrabalhaNoite(le.next().equalsIgnoreCase("s"));
          System.out.println("Informe se eh vendedor (S)im ou Nao:");
          f.setEhVendedor(le.next().equalsIgnoreCase("s"));
          if(f.getEhVendedor()){
              System.out.println("Informe o total de vendas:");
              f.setTotalVendas(le.nextDouble()); 
        }
        return f;
    }
}
