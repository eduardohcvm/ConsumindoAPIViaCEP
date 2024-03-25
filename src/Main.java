import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException{

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o CEP do endereço que gostaria encontrar:");
        String CEP = leitura.nextLine();
        fazerConexao endereco = new fazerConexao();
        endereco.fazerConexao(CEP);
        
    }
}