import java.util.Scanner;

public class Lista2Opcao2 {
    public void executar() {
        App.limpatela();
        
        System.out.println("Você escolheu: Lista 2 -> Opção 2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n1 = scanner.nextInt();
		 System.out.print("Digite outro número: ");
        int n2 = scanner.nextInt();
		if (n1 > n2) {
            System.out.println( n1 +  " é maior que " +  n2  );
        } else if (n2 > n1) {
            System.out.println( n2 + " é maior que "+  n1 );
        } else {
            System.out.println("Números iguais. Tente de novo.");
        }

        scanner.close();
        App.aguardarTecla();
    }
}
