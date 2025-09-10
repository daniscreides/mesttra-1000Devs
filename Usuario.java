import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        
        String nome_usuario;
        String sobrenome_usuario;
        String nome_mae;
        String nome_pai;
        int idade_usuario;
        
        System.out.print("Digite seu nome: ");
        nome_usuario = leitura.nextLine();

        System.out.print("Digite seu sobrenome: ");
        sobrenome_usuario = leitura.nextLine();

        System.out.print("Digite o nome da sua mãe: ");
        nome_mae = leitura.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        nome_pai = leitura.nextLine();

        System.out.print("Digite sua idade: ");
        idade_usuario = leitura.nextInt();
        
        System.out.println("Olá, " + nome_usuario + ". " + "Você tem " + idade_usuario + " anos. E seus pais são " + nome_mae + " e " + nome_pai + ".");
        
        leitura.close();
    }
}