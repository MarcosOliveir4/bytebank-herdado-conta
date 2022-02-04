package Funcionario;

public class Administrador extends Funcionario implements Autenticavel {

    private int senha;

    public Administrador(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        setSenha(senha);
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return false;
    }
}
