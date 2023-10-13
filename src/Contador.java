import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        System.out.println("CONTAGEM DE NUMÉROS");

        Scanner input = new Scanner(System.in);

        System.out.println("ABAIXO, DIGITE O INTERVALO DE NUMEROS A SER CONTADO");
        
        System.out.println("DIGITE O PRIMEIRO NUMERO:");

        int numeroUm = input.nextInt();

        System.out.println("DIGITE O SEGUNDO NUMERO: ");
        int numeroDois = input.nextInt();

        try {

            contar(numeroUm, numeroDois);

        } catch (ParametrosInvalidosException e){

            System.out.println("Erro " + e.getMessage());

        }

    } 

    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException{

        if(numeroUm >= numeroDois){

            throw new ParametrosInvalidosException();

        }
        
        int contagem = numeroDois - numeroUm;

        for(int i = 1; i<= contagem; i++){
            System.out.println("Imprimindo a " + i + "ª interação: " + i);
        }

    }
}
