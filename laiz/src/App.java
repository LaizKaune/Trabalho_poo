
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {       
        menuprincipal();
      } 
   
     // Menu principal com as listas do professor    
    public static void menuprincipal() {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            limpatela();
            System.out.println("Aulas Java:");
            System.out.println("1. Lista 1");
            System.out.println("2. Lista 2");
            System.out.println("3. lista 3");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: (1, 2, 3 ou 0) ");
            int opcao = scanner.nextInt();

        switch (opcao) {
                case 1:
                    menuLista1(scanner);
                    break;
                case 2:
                    menuLista2(scanner);
                    break;
                case 3:
                    menuLista3(scanner);
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                System.out.println("Opção inválida! Tente novamente. (1, 2 ou 0)");
            }
        }
    }
    // mostra as opçções para os exercicios da Lista 1
    private static void menuLista1(Scanner scanner) {
        boolean exit = false;

        while (!exit) {
            limpatela();
            System.out.println("Menu Lista 1:");
            System.out.println("1. Exercicio 1");
            System.out.println("2. Exercicio 2");
            System.out.println("3. Exercicio 3");
            System.out.println("4. Exercicio 4");
            System.out.println("5. Exercicio 5");
            System.out.println("6. Exercicio 6");
            System.out.println("7. Exercicio 7");
            System.out.println("8. Exercicio 8");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    new Lista1Opcao1().executar();
                    break;
                case 2:
                    new Lista1Opcao2().executar();
                    break;
                case 3:
                    new Lista1Opcao3().executar();
                    break;
                case 4:
                    new Lista1Opcao4().executar();
                    break;
                case 5:
                    new Lista1Opcao5().executar();
                    break;
                case 6:
                    new Lista1Opcao6().executar();
                    break;
                case 7:
                    new Lista1Opcao7().executar();
                    break;
                case 8:
                    new Lista1Opcao8().executar();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
    // Exibe o menu da Lista 2
    private static void menuLista2(Scanner scanner) {
        boolean exit = false;

        while (!exit) {
            limpatela();
            System.out.println("Menu Lista 2:");
            System.out.println("1. Exercicio 1");
            System.out.println("2. Exercicio 2");
            System.out.println("3. Exercicio 3");
            System.out.println("4. Exercicio 4");
            System.out.println("5. Exercicio 5");
            System.out.println("6. Exercicio 6");
            System.out.println("7. Exercicio 7");
            System.out.println("8. Exercicio 8");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    new Lista2Opcao1().executar();
                    break;
                case 2:
                    new Lista2Opcao2().executar();
                    break;
                case 3:
                    new Lista2Opcao3().executar();
                    break;
                case 4:
                    new Lista2Opcao4().executar();
                    break;
                case 5:
                    new Lista2Opcao5().executar();
                    break;
                case 6:
                    new Lista2Opcao6().executar();
                    break;
                case 7:
                    new Lista2Opcao7().executar();
                    break;
                case 8:
                    new Lista2Opcao8().executar();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
    // Exibe o menu para classes e objetos parte 1
    private static void menuLista3(Scanner scanner) {
        boolean exit = false;
        while (!exit) {
            limpatela();
            System.out.println("Menu Classes:");
            System.out.println("1. Exercicio 1");
            System.out.println("2. Exercicio 2");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    new Lista2Opcao1().executar();
                    break;
                case 2:
                    new Lista2Opcao2().executar();
                    break;
                    default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
    // Método para limpar a tela
    public static void limpatela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    // aguardar input antes de continuar
    public static void aguardarTecla() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n1Pressione tecla enter para voltar ao menu principal...");
    scanner.nextLine();
    App.menuprincipal();
    scanner.close();
        }
}
