package Funcionario;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    @Override
    public double getBonificacao() {
        return super.salario;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
