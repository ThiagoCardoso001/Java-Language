import java.util.Scanner;
import java.util.ArrayList;

public class Principal
{
    static Scanner le = new Scanner(System.in);
    public static void main(String[] args){
         ArrayList<Cliente> clientes = new ArrayList<>();
         
         while(true){
             int op= menu();
             if(op==6){
                 break;
             }
             else if(op==1){
                 clientes.add(cadastrarCliente());
             }
             else if(op==2){
                 listaClientes(clientes);
             }
             else if (op == 3){
                 Cliente cli = pesquisaCliente(clientes);
                 cli.addConta(cadastrarConta());
             }
         }
    }
    
    public static Cliente pesquisaCliente(ArrayList<Cliente> cLista){
        System.out.println("\n\n\n######### CRIAR CONTA##############");
        System.out.println("#### Escolha o numero do cliente: ");
        int count = 1;
        
        for(Cliente c: cLista){
            System.out.println("## "+(count++)+")"+c.getNome());
        }
        int posicao = le.nextInt();
        return cLista.get(posicao - 1);//cliente[posicao - 1]
    }

    public static void listaClientes(ArrayList<Cliente> cLista){
         System.out.println(">>>>> Lista <<<<<");
         for(Cliente c : cLista){
             System.out.println(" >> Nome: "+c.getNome());
             System.out.println(" >> Salario: "+c.getSalario());
             System.out.println(" >> Saldo Total: R$ "+c.saldoTotalContas() +"\n\n");
         }
    }
    
    public static Conta cadastrarConta(){
        return new Poupanca();
    }
    
    public static Cliente cadastrarCliente(){
         System.out.println(">>>>> Cliente <<<<<");
         Cliente cli = new Cliente();
         System.out.println("Nome :");
         le.nextLine();
         cli.setNome(le.nextLine());
         System.out.println("Salario :");
         cli.setSalario(le.nextDouble());
         return cli;
    }
    public static int menu(){
        System.out.println("################ MENU #################");
        System.out.println("#     1 - Cadastrar CLiente           #");
        System.out.println("#     2 - Listar Clientes             #");
        System.out.println("#     3 - Criar Conta                 #");
        System.out.println("#     4 - Realizar Operaçoes na Conta #");
        System.out.println("#     5 - Realatorios                 #");
        System.out.println("#     6 - Sair                        #");
        System.out.println("#######################################");
        return le.nextInt();
    }
}
