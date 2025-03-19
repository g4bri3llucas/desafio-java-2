import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static void calcularAreaDoCirculo(double raio) {
        double resultado = raio * 2 * 3.14;
        System.out.println(" A area da circunferencia 'e: " + resultado);
    }

    static void calcularAreaDoQuadrado(double ladoA, double ladoB) {
        double resultado = ladoA * ladoB;
        System.out.println(" A area do retangulo 'e: " + resultado);
    }

    static void soma(double valor1, double valor2) {
        System.out.println(valor1 + valor2);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Como voce se chama?");
            String nome = ler.next();
            System.out.println(nome + " seja bem vindo! ");

            System.out.println("Vamos somar? ");
            System.out.println(" digite o numero 1");
            double n1 = ler.nextDouble();
            System.out.println(" digite o numero 2");
            double n2 = ler.nextDouble();
            System.out.println(" a soma de numero1 e numero 2 'e ");
            soma(n1, n2);

            //calcularAreaDoCirculo(180);

            //calcularAreaDoQuadrado(12, 30);

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar números.");
        } finally {
            ler.close(); // Fechar o Scanner para liberar recursos
        }
    }
}