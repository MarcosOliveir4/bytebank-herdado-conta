package Funcionario;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, double salario) {
        setNome(nome);
        setCpf(cpf);
        setSalario(salario);
    }

    public abstract double getBonificacao();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}