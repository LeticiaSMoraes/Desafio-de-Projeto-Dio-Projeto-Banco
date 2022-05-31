
package banco;

public class contaPoupança extends conta{
    public contaPoupança(Cliente cliente){
        super(cliente);
    }

   
    
    public void imprimirExtrato(){
        System.out.println("Extrato Conta Poupança");
        super.informacoes();
    }
}
