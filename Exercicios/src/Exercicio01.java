import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio01 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int idade=0;

                try {
                    System.out.print("Digite sua idade (inteiro): ");
                    idade = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Você deve digitar apenas números inteiros.");
                }
                double altura = 0;
                try {
                    System.out.print("Digite sua altura (ex: 1,75): ");
                    altura = scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Você deve digitar apenas números.");
                }


            System.out.println("\nDados cadastrados com sucesso!");
            System.out.println("Idade: " + idade + " anos | Altura: " + altura + "m");

            scanner.close();
        }
    }


