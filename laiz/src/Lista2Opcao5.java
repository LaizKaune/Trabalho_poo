import java.util.Scanner;

public class Lista2Opcao5 {
    public void executar() {
        App.limpatela();
        System.out.println("Você escolheu: Lista 2 -> Opção 5");
         Scanner sc = new Scanner(System.in);

        
        String usuario="admin";
        String senha="admin";
        String u="";
        String s="";

        System.out.print("Digite o Usuário: ");
        u=sc.nextLine();

        System.out.print("Digite a Senha: ");
        s=sc.nextLine();

        if (!usuario.equals(u) && senha.equals(s)) {
            System.out.println("Usuário incorreto");
        }
        else if (usuario.equals(u) && !senha.equals(s)) {
            System.out.println("Senha incorreta");
        }
        else if (!usuario.equals(u) && !senha.equals(s)) {
            System.out.println("Usuário e Senha incorretos");
        }
        else if (usuario.equals(u) && senha.equals(s)) {
            System.out.println("Login efetuado com sucesso");
        }
        sc.close();
        App.aguardarTecla();
    }
}
