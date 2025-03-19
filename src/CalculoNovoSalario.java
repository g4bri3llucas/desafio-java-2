import java.util.Scanner;

public class CalculoNovoSalario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = scanner.nextDouble();

        
        double novoSalario = salarioAtual * 1.25;

        
        System.out.printf("O novo salário do funcionário será: R$ %.2f%n", novoSalario);

        
        scanner.close();
    }
}