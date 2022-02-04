package Funcionario;

public class EditorVideo extends Funcionario {
    public EditorVideo(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        return super.salario * 0.1;
    }
}
