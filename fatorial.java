package exercicios;

import java.util.Scanner;

public class fatorial {

    // método para calcular o fatorial
    public static int calcularFatorial(int numero) {
        int fatorial = 1;

        //forma iterativa para calcular o fatorial
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite um número para calcular o fatorial: ");
        int numero = scan.nextInt();

        // calcula e mostra o fatorial
        if (numero >= 0) {
            int fatorial = calcularFatorial(numero);
            System.out.println("o fatorial de " + numero + " é: " + fatorial);
        } else {
            System.out.println("não calcula fatorial negativo");
        }

        scan.close();
    }
}
