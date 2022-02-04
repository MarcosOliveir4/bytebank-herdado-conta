package Conta;

import Cliente.Cliente;
import Conta.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero, double saldo, Cliente titular) {
        super(agencia, numero, saldo, titular);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
