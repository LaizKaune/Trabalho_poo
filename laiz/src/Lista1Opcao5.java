import java.util.Scanner;

public class Lista1Opcao5 {
    public void executar() {
        App.limpatela();
        System.out.println("Você escolheu: Lista 1 -> Opção 5");
         Scanner sc = new Scanner(System.in);

        float c, l, a, valorm2, valorterreno;

        System.out.println("Comprimento do terreno:");
        c = sc.nextFloat();

        System.out.println("Largura do terreno:");
        l = sc.nextFloat();

        a = (c*l);

        System.out.print("Digite o valor do metro quadrado na região do terreno: R$");
        valorm2 = sc.nextFloat();

        valorterreno = (a*valorm2);

        System.out.println("\nO terreno custa R$"+valorterreno+" nos seguintes parametros:");
        System.out.println("Area: "+a+"m² | Valor do m²: R$"+valorm2+" | Valor do Terreno: R$"+valorterreno);
         
        sc.close();
        App.aguardarTecla();
    }
}
