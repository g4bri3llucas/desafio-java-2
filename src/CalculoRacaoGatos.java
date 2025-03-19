import java.util.Scanner;

public class CalculoRacaoGatos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o peso do saco de ração (em quilos): ");
        double pesoRacaoKg = scanner.nextDouble();

        
        System.out.print("Digite a quantidade de ração fornecida para cada gato (em gramas): ");
        double racaoPorGatoGramas = scanner.nextDouble();

        
        double pesoRacaoGramas = pesoRacaoKg * 1000;

        
        double racaoTotalCincoDias = 2 * racaoPorGatoGramas * 5;

        
        double racaoRestante = pesoRacaoGramas - racaoTotalCincoDias;

        
        System.out.printf("Após cinco dias, restará %.2f gramas de ração no saco.%n", racaoRestante);

        
        scanner.close();
    }
}