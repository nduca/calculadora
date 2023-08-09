import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("CALCULADORA SIMPLES");

        int opcao;
        do {
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.print("o que vc deseja fazer? (0 para sair): ");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            processar(opcao);

        } while (opcao != 0);
    }

    public static void processar(int opcao){

        Scanner scanner = new Scanner(System.in);

        switch (opcao) {
            case 1:{
                System.out.println("SOMANDO VALORES");

                System.out.print("Digite o primeiro valor: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo valor: ");
                int numero2 = scanner.nextInt();

                int resultado = numero1 + numero2;

                System.out.println("o resultado da soma dos dois valores é: " + resultado);
                break;
            }
            case 2:{
                System.out.println("SUBTRAINDO VALORES");
                System.out.print("Digite o primeiro valor: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo valor: ");
                int numero2 = scanner.nextInt();

                int resultado = numero1 - numero2;

                System.out.println("o resultado da subtracao dos dois valores é: " + resultado);
                break;
            }
            case 3:{
                System.out.println("MULTIPLICANDO VALORES");
                System.out.print("Digite o primeiro valor: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo valor: ");
                int numero2 = scanner.nextInt();

                int resultado = numero1 * numero2;

                System.out.println("o resultado da multiplicacao dos dois valores é: " + resultado);
                break;
            }
            case 4:{
                System.out.println("DIVIDINDO VALORES");
                System.out.print("Digite o primeiro valor: ");
                double numero1 = scanner.nextInt();

                System.out.print("Digite o segundo valor: ");
                double numero2 = scanner.nextInt();

                if (numero2 == 0){
                    System.out.println("Impossivel dividir por 0");
                } else {
                    double resultado = numero1 / numero2;
                    System.out.println("o resultado da divisao dos dois valores é: " + resultado);
                }
                break;
            }
        }
    }
}