import java.util.Scanner;

public class Prog01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // pede para digitar uma palavra várias vezes
        String texto;
        int voltas = 0;

        do {
            if(voltas >= 3){
                System.out.println("Você errou 3 vezes");
            break;}
            System.out.println("Digite qualquer palavra: ");
            texto = leitura.next();
            voltas++;
        } while (!texto.equalsIgnoreCase("banana"));
        System.out.printf("Você tentou %d  vezes\n", voltas);

    }


}