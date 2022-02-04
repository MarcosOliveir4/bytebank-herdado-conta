import Cliente.PessoaFisica;
import Conta.ContaCorrente;
import Conta.ContaPoupanca;
import Funcionario.Administrador;
import Funcionario.Gerente;
import Sistema.SistemaInterno;

public class Main {
    public static void main(String[] args) {
        PessoaFisica cliente = new PessoaFisica("Marcos Oliveira", "Programador", "854-968-444-89");
        ContaCorrente contaCorrente = new ContaCorrente(12, 45, 0, cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(12, 46, 0, cliente);

        contaCorrente.deposita(100.0);
        contaPoupanca.deposita(200.0);

        contaCorrente.transfere(10.0, contaPoupanca);

        System.out.println("Conta.Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Conta.Conta Poupança: " + contaPoupanca.getSaldo());

        System.out.println("---------------------------");

        Gerente gerente = new Gerente("Maria Sofia", "857.458.639-88", 5000.0, 2222);
        Administrador administrador = new Administrador("Marcos Oliveira", "879.789.856-99", 5000, 1515);

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Autenticado: " + gerente.autentica(2222));

        System.out.println("---------------------------");

        SistemaInterno sistemaInterno = new SistemaInterno();

        System.out.print("Gerente: ");
        sistemaInterno.autentica(gerente);
        System.out.print("Administrador: ");
        sistemaInterno.autentica(administrador);

    }
}
