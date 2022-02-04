package Cliente;

public abstract class Cliente {
    private String nome;
    private String profissao;

    public Cliente(String nome, String profissao) {
        setNome(nome);
        setProfissao(profissao);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return this.profissao;
    }
}