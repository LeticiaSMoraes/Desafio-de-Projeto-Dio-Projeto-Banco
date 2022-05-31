
package banco;

public class Main {

    public static void main(String[] args) {
        
        Cliente Leticia = new Cliente();
        Leticia.setNome("Leticia");
        
        conta cc = new contaCorrente(Leticia);
        conta poupanca = new contaPoupança(Leticia);
        
        System.out.println("Conta Corrente");;
        cc.informacoes();
        
        System.out.println("_____________________________________________");
        
        System.out.println("Conta Poupança");
        poupanca.informacoes();
    }
    
}
