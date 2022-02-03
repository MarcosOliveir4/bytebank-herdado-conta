public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica(String nome, String profissao, String cpf) {
        super(nome, profissao);
        setCpf(cpf);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
