import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Random gerador = new Random();
        int tentativas = 5;
        int numero = 0;
        int numDado = gerador.nextInt(10);



        while (tentativas > 0){
            System.out.print("Digite um número secreto entre 0 e 10: ");
            numero = leia.nextInt();
            tentativas--;
            //mumero secreto
            //System.out.println(numDado);


            if (numero == numDado) {
                System.out.println("Meus parabéns você acertou!");
                break;

            } else if (numero > numDado) {
                System.out.println("O número secreto é menor");

            } else {
                System.out.println("O número secreto é maior");
            }

            System.out.println("Número digitado pelo usuário: " + numero);
            System.out.println();
            System.out.println("Você tem " + tentativas + " tentativas");
        }
        leia.close();
    }
}