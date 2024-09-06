import java.util.Scanner;

public class Lista1Opcao3 {
    public void executar() {
        App.limpatela();
        System.out.println("Você escolheu: Lista 1 -> Opção 3");
         double valor_real;
        //declarado para poder ser mudado dependendo da cotação.
        double valor_dolar = 5.25;
        double valor_total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o valor em reais: ");
        valor_real = sc.nextDouble();

        valor_total = valor_real / valor_dolar;
        System.out.println("valor total: " + valor_total);
        App.aguardarTecla();
    }
}
