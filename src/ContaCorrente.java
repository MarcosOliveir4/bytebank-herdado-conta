public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero, double saldo, Cliente titular) {
        super(agencia, numero, saldo, titular);
    }

    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
}
