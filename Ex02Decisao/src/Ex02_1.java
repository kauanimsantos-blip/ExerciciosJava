import java.util.Scanner;
/*-------------------------------------------------------------------
    Ex 2.1: Subtotal e raspadinhas
    - informar o valor da compra
    - dar raspadinhas de brinde para compras acima de R$ 100

    TAREFA:
    - peça para o usuário informar o valor em reais da compra
    - se o valor for maior que R$ 100, calcule quantas raspadinhas o
      cliente deve receber: uma raspadinha para cada R$ 100
    - imprima a quantidade de raspadinhas recebidas

    ATENÇÃO:
    - não pode existir uma quantidade fracionária de raspadinhas
    - use a função Math.round() para arredondar a quantidade calculada
    - uma forma de calcular é: Math.round(valor / 100.0)
-------------------------------------------------------------------*/
public class Ex02_1 {
        public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);
                System.out.print("Informe o valor da compra: R$");
                Double valorCompra = teclado.nextDouble();

                if (valorCompra >= 100){
                        int qtdRaspadinhas = (int) (valorCompra / 100.0);
                        System.out.println("Você ganhou " + qtdRaspadinhas + " raspadinhas de brinde!");
                } else{
                        System.out.println("Prefere completar o valor de R$100,00 para ganhar uma raspadinha?");
                }

        }
}
