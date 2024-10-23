package exercicios;

public class DiasDaSemana {

    // método pra mostrar o dia da semana de acordo com o numero
    public static String exibirDiaSemana(int numero) {
        String dia;

        // switch case para retornar o dia
        switch (numero) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "dia inválido";
                break;
        }

        return dia;
    }

    public static void main(String[] args) {
        System.out.println(exibirDiaSemana(2)); 
        System.out.println(exibirDiaSemana(5)); 
        System.out.println(exibirDiaSemana(1));
        System.out.println(exibirDiaSemana(9)); 
    }
}
