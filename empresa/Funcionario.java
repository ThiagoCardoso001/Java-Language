public class Funcionario
{
    // atributos
    private String nome;
    private double salarioBase, totalVendas;
    private int numeroFilhos;
    private boolean usaValeTransporte, trabalhoNoite, ehVendedor;
    
    //construtores
    public Funcionario(){
    }
    public Funcionario(String nome, double salarioBase, double totalVendas, int numeroFilhos, boolean usaValeTransporte, boolean trabalhoNoite,
    boolean ehVendedor){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.totalVendas = totalVendas;
        this.numeroFilhos = numeroFilhos;
        this.usaValeTransporte = usaValeTransporte;
        this.trabalhoNoite = trabalhoNoite;
        this.ehVendedor = ehVendedor;
    }
    public Funcionario(String nome, double salarioBase, double totalVendas, int numeroFilhos, boolean usaValeTransporte, boolean trabalhoNoite){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.totalVendas = totalVendas;
        this.numeroFilhos = numeroFilhos;
        this.usaValeTransporte = usaValeTransporte;
        this.trabalhoNoite = trabalhoNoite;
        this.ehVendedor = false;
    }
    
    //Metodos
    public double inss(){
        return salarioBase*0.13;
    }
    
    public double bonusPorFilho(){
        return (numeroFilhos <= 3)?numeroFilhos*50:150;
    }
    
    public double descontoDeVale(){
        if(usaValeTransporte){
            return salarioBase*0.03;
        }
        return 0;
    }
    
    public double bonusTrabalhoNoturno(){
        return trabalhoNoite?salarioBase*0.05:0;
    }
    
    public double bonusVendedor(){
        return ehVendedor?totalVendas*0.02:0;
    }
    
    public double salario(){
        return salarioBase - inss() + bonusPorFilho() - descontoDeVale()
            +bonusTrabalhoNoturno() + bonusVendedor();
    }
    /*
    public double salario(){
        return salarioBase*0.87
                + (numeroFilhos <= 3?numeroFilhos*50:150)
                - (usaValeTransporte?salarioBase*0.03:0)
                + (trabalhoNoite?salarioBase*0.05:0)
                + (ehVendedor?totalVendas*0.02:0);
    }
    */
 
    
    //metodos de Acesso
    public void setNome(String nome) {
        if(nome != null && !nome.equals("")) {
            this.nome = nome;
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSalarioBase(double salarioBase){
        if(salarioBase >= 0){
            this.salarioBase = salarioBase;
        }
    }
    
    public double getSalarioBase(){
        return this.salarioBase;
    }
    
    public void setTotalVendas(double totalVendas){
        if(totalVendas >= 0) {
            this.totalVendas = totalVendas;
        }
    }
    
    public double getTotalVendas(double totalVendas) {
        return this.totalVendas;
    }
    
    public void setNumeroFilhos(int numeroFilhos){
        if(numeroFilhos >=0){
            this.numeroFilhos = numeroFilhos;
        }
    }
    
    public int getNumeroDeFilhos(int numeroFilhos){
        return this.numeroFilhos;
    }
    
    public void setUsaValeTransporte(boolean usaValeTransporte){
        this.usaValeTransporte = usaValeTransporte;
    }
    
    public boolean getUsaValeTransporte(){
        return this.usaValeTransporte;
    }
    
    public void setTrabalhaNoite(boolean trabalhoNoite){
        this.trabalhoNoite = trabalhoNoite;
    }
    
    public boolean getTrabalhoNoite() {
        return this.trabalhoNoite;
    }
    
    public void setEhVendedor(boolean ehVendedor) {
        this.ehVendedor = ehVendedor;
    }
    
    public boolean getEhVendedor(){
        return this.ehVendedor;
    }
}
