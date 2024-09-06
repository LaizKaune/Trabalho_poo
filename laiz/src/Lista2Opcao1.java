import java.util.Scanner;

public class Lista2Opcao1 {
    public void executar() {
        App.limpatela();
        System.out.println("Você escolheu: Lista 2 -> Opção 1");
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é 0, par ou ímpar
        if (numero == 0) {
            System.out.println("O número é 0.");
        } else if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
           App.aguardarTecla();
    }
}
