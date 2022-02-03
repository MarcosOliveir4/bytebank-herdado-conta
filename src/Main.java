public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Marcos Oliveira", "452.478.968-99", "Programador");
        ContaCorrente contaCorrente = new ContaCorrente(12,45,0, cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(12, 46, 0, cliente);

        contaCorrente.deposita(100.0);
        contaPoupanca.deposita(200.0);

        contaCorrente.transfere(10.0, contaPoupanca);

        System.out.println("Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Conta Poupança: " + contaPoupanca.getSaldo());

    }
}
