import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        Cliente cliente1 = new Cliente("Elisafa", "02254798632", "Rua Jacaranda");
        Conta c1 = new ContaCorrente(cliente1);
        Conta p1 = new ContaPoupanca(cliente1);
        contas.add(c1);

        c1.depositar(100);
        c1.transferir(40, p1);

        c1.imprimirExtrato();
        p1.imprimirExtrato();

        Cliente cliente2 = new Cliente("Elioenay", "02685478562", "Rua Divinopolis");
        Conta c2 = new ContaCorrente(cliente2);
        Conta p2 = new ContaPoupanca(cliente2);
        contas.add(c2);

        c2.depositar(150);
        c2.transferir(120, p2);

        c2.imprimirExtrato();
        p2.imprimirExtrato();

        Cliente cliente3 = new Cliente("Pedro Paulo", "02648796315", "Rua Miami");
        Cliente cliente4 = new Cliente("Rebeca", "45698712345", "Rua Londres");

        ClienteUtils.listarClientes(contas);
    }

}