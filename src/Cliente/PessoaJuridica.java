package Cliente;

import Cliente.Cliente;

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, String profissao, String cnpj) {
        super(nome, profissao);
        setCpf(cnpj);
    }

    public void setCpf(String cpf) {
        this.cnpj = cpf;
    }
}
