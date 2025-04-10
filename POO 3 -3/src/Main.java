import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String nome;
        String cpf;
        String rua;
        String bairro;
        String complemento;
        String cidade;
        String estado;
        int numero;
        Endereço end = new Endereço("Flores", "Jardim Amora","Perto do hospital geral", "Xique-Xique", "Bahia",4);
        Cliente cliente = new Cliente("João", "123456789-30", end);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Rua: " + cliente.getEnd().getRua());
        System.out.println("Rua: " + cliente.getEnd().getBairro());
        }


    }
