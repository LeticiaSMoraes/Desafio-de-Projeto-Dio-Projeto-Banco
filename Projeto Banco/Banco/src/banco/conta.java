
package banco;
public  class conta{
    
    private static final int AGENCIA_PADRAO = 1;
    private static int Sequence = 1;
    
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;
    
    public conta (Cliente cliente){
      this.agencia = AGENCIA_PADRAO;
      this.numeroConta = Sequence++;
      this.cliente = cliente;
    }
    
    public void sacar (double valor){
        this.saldo = saldo - valor;
    }
    
    public void depositar (double valor){
        this.saldo = saldo + valor;
    }
    
    public void transferir (double valor, conta contadestino){
        this.sacar(valor);
        contadestino.depositar(valor);
    }
    
    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
     protected void informacoes(){
        System.out.println(String.format("*****Titular: %s****", this.cliente.getNome()));
         System.out.println("----------------------------------------------");
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Numero da Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
     }  
}
