import java.util.Scanner;

public class Lista1Opcao1 {
    public void executar() {
        App.limpatela();
        System.out.println("Você escolheu: Lista 1 -> Opção 1");
        double n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();
        double soma = n1 + n2;
        System.out.print("A soma é: "+soma); 
        System.out.print("\n"); 
        App.aguardarTecla();
    }
}
