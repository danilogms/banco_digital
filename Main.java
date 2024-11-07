public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(20);


        Conta poupanca = new ContaPoupanca();
        poupanca.depositar(10);


        cc.transferir(20, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
