import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Banco {

    private String nome;
    private List<Conta> contas;

    protected void dadosConta(List<Conta> contas) {
        System.out.println("=== Contas do Banco ===");
        for(int i=0;i<contas.size();i++){
            System.out.println("Titular: " + contas.get(i).cliente.getNome());
            System.out.println("Agencia: " + contas.get(i).getAgencia());
            System.out.println("Numero: " + contas.get(i).getNumero());
            System.out.println("");
        }
    }
}
