import java.util.Scanner;

public class Lista1Opcao6 {
    public void executar() {
        App.limpatela();
        System.out.println("Você escolheu: Lista 1 -> Opção 6");
        Scanner sc = new Scanner(System.in);

        float dist, gasolina, mediaconsumo;
        
        System.out.print("Em quilômetros, digite a distancia percorrida: ");
        dist = sc.nextFloat();
        
        System.out.print("Em litros, digite o total de combustível gasto: ");
        gasolina = sc.nextFloat();

        mediaconsumo = (dist/gasolina);

        System.out.println("O a média é: "+mediaconsumo+"km/l");
        sc.close();
        App.aguardarTecla();
    }
}
