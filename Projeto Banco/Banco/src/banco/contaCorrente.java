
package banco;


public class contaCorrente extends conta{
    public contaCorrente(Cliente cliente){
        super(cliente);
    }

    
    
    public void imprimirExtrato(){
        System.out.println("Extrato Conta Corrente");
        super.informacoes();
    }
}
