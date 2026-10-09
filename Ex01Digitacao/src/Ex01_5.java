/*-------------------------------------------------------------------
  Ex 1.5: Troca de dinheiro
  - informar um valor inteiro em reais, sem os centavos
  - calcular quantas notas e moedas podem ser obtidas na troca

  TAREFA:
  - peça para o usuário informar um valor inteiro em reais, sem os centavos
  - calcule e imprima quantas notas de 50, 10, 5 e 2 reais
    e quantas moedas de 1 real é preciso para fazer esse valor
  - não é necessário usar if em nenhum lugar: use apenas divisão inteira (/)
    e resto da divisão (%)

  DESAFIO:
  - depois de terminar, altere o programa para aceitar um valor double,
    incluindo os centavos
  - calcule e imprima também quantas moedas de 50, 25, 10, 5 e 1 centavo
    podem ser obtidas
-------------------------------------------------------------------*/
import java.util.Scanner;
public class Ex01_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita o valor inteiro ao usuário
        System.out.print("Digite um valor inteiro em reais (sem centavos): R$ ");
        int valor = scanner.nextInt();
         // Calcula as notas de 50
        int notas50 = valor / 50;
        valor = valor % 50;

        // Calcula as notas de 10
        int notas10 = valor / 10;
        valor = valor % 10;

        // Calcula as notas de 5
        int notas5 = valor / 5;
        valor = valor % 5;

        // Calcula as notas de 2
        int notas2 = valor / 2;
        valor = valor % 2;

        // O que sobra são as moedas de 1 real
        int moedas1 = valor;

        // Imprime o resultado
        System.out.println("Notas de R$ 50: " + notas50);
        System.out.println("Notas de R$ 10: " + notas10);
        System.out.println("Notas de R$ 5: " + notas5);
        System.out.println("Notas de R$ 2: " + notas2);
        System.out.println("Moedas de R$ 1: " + moedas1);

        scanner.close();
    }
}



