import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            // Converte os argumentos para inteiros
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            // Valida se os parâmetros são números inteiros e se o primeiro é menor ou igual ao segundo
            if (num1 > num2) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            // Calcula a diferença entre os números para obter o número de iterações
            int diferenca = num2 - num1;

            // Loop para imprimir os números incrementados
            for (int i = 1; i <= diferenca; i++) {
                System.out.println("Imprimindo o número " + (num1 + i));
            }
        } catch (NumberFormatException e) {
            System.out.println("Os parâmetros fornecidos devem ser números inteiros.");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}

