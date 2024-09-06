import java.util.Scanner;

public class Lista1Opcao8 {
    public void executar() {
        App.limpatela();
        System.out.println("Você escolheu: Lista 1 -> Opção 8");
        Scanner sc = new Scanner(System.in);

        float tempF, tempC, tempK;

        System.out.println("Digite a temperatura fornecida em Fahrenheit: ");
        tempF = sc.nextFloat();

        tempC = ((tempF-32)/1.8f);
        tempK = (tempC+273.15f);
        System.out.println("Convertendo para Celsius, "
                            +"a temperatura está em "+tempC+"°C ("+tempF+"°F ou "+tempK+"K)");
        sc.close();
        App.aguardarTecla();
    }
}
