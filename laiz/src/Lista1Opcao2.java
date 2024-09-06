import java.util.Scanner;

public class Lista1Opcao2 {
    public void executar() {
        App.limpatela();
        System.out.println("Você escolheu: Lista 1 -> Opção 2");
        String nome, sobrenome;
            
            Scanner sc = new Scanner(System.in);

            System.out.print("\nNome: ");
            nome = sc.nextLine();
            System.out.print("\nSobrenome: ");
            sobrenome = sc.nextLine();

            System.out.printf("Olá, -%s %s-", nome, sobrenome , "\n");

            sc.close();
        App.aguardarTecla();

    }
}
