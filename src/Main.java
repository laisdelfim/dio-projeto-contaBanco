public class Main {

    public static void main(String[] args) {
        Cliente Lais = new Cliente();
        Lais.setNome("Lais");

        Conta cc = new ContaCorrente(Lais);
        Conta poupanca = new ContaPoupanca(Lais);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}