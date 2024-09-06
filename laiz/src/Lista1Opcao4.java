import java.util.Scanner;

public class Lista1Opcao4 {
    public void executar() {
        App.limpatela();
        System.out.println("Você escolheu: Lista 1 -> Opção 4");
         int numero;

        System.out.print("\nDigite um número: ");
        Scanner sc = new Scanner(System.in);

        numero = sc.nextInt();

        System.out.print("\nO antecessor de "+numero+" é "+(numero-1));
        System.out.print("\nO sucessor de "+numero+" é "+(numero+1));
        sc.close();
        App.aguardarTecla();
    }
}
