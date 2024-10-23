package exercicios;

public class VetorOperacoes {

    // função a retorna o maior
    public static int maiorValor(int[] vetor) {
        int maior = vetor[0]; 
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    // função b retorna o menor
    public static int menorValor(int[] vetor) {
        int menor = vetor[0]; 
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    // função c retorna a media do maior e menor
    public static double mediaMaxMin(int[] vetor) {
        int max = maiorValor(vetor);
        int min = menorValor(vetor);
        return (max + min) / 2.0; 
    }

    public static void main(String[] args) {
        int[] numeros = {3, 8, 5, 40, 7, 9};

        System.out.println("maior valor: " + maiorValor(numeros)); 
        System.out.println("menor valor: " + menorValor(numeros)); 
        System.out.println("média entre o maior e menor valor: " + mediaMaxMin(numeros)); 
    }
}