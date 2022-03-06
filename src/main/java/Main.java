import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Cliente mauricio = new Cliente();
        mauricio.setNome("Mauricio");

        Cliente junior = new Cliente();
        junior.setNome("Junior");

        Banco itau = new Banco();
        ArrayList<Conta> contas = new ArrayList<>();

        Conta cc = new ContaCorrente(mauricio);
        Conta poupanca = new ContaPoupanca(junior);

        contas.add(cc);
        contas.add(poupanca);

        itau.setContas(contas);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        itau.dadosConta(contas);
    }

}