import java.util.Scanner;

public class Lista2Opcao3 {
    public void executar() {
        App.limpatela();
        System.out.println("Você escolheu: Lista 2 -> Opção 3");
         Scanner sc = new Scanner(System.in);
        int op;

        System.out.println("\nVocê tem mais de 65 anos? \n1-Sim\n0-Não");
        op=sc.nextInt();
            if (op==1) {
                System.out.println("Vá para a fila preferencial");
            } else {
                System.out.println("\nVocê é uma Pessoa com Deficiência(PCD)? \n1-Sim\n0-Não");
                op=sc.nextInt();
                if (op==1) {
                    System.out.println("Vá para a fila preferencial");
                } else {
                    System.out.println("\nVocê é Gestante? \n1-Sim\n0-Não");
                    op=sc.nextInt();
                    if (op==1) {
                        System.out.println("Vá para a fila preferencial");
                    } else {
                        System.out.println("Vá para a fila comum");
                    }
                }
            }  
        sc.close();      
        App.aguardarTecla();
    }
}
