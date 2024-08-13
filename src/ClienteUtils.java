import java.util.List;

public class ClienteUtils {

    public static void listarClientes(List<Conta> contas){
        System.out.println("LISTA DE CLIENTES");
        for (Conta conta : contas) {
            System.out.println("Cliente: " + conta.cliente.getNome());
            System.out.println("CPF: " + conta.cliente.getCpf());
            System.out.println("Endereço: " + conta.cliente.getEndereco());
            System.out.println("---------------");
        }
    }
}
