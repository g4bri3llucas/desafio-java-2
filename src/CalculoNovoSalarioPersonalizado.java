import java.util.Scanner;

public class CalculoNovoSalarioPersonalizado {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        
        System.out.print("Digite o percentual de aumento (%): ");
        double percentualAumento = scanner.nextDouble();

        
        double novoSalario = salarioAtual * (1 + percentualAumento / 100);

        
        System.out.printf("O novo salário do funcionário será: R$ %.2f%n", novoSalario);

        
        scanner.close();
    }
}