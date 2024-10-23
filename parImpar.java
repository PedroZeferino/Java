package exercicios;

import java.util.Scanner;

public class parImpar {

    // método para verificar se o número é par
    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;

        // loop para pedir numero para o usuario
        while (true) {
            System.out.print("digite um número: ");
            numero = scan.nextInt();

            // se der ruim encerrar
            if (numero < 0) {
                System.out.println("programa encerrado.");
                break;
            }

            // verificar se o número é par ou ímpar
            if (isPar(numero)) {
                System.out.println("número par.");
            } else {
                System.out.println("número ímpar.");
            }
        }
        scan.close();
    }
}