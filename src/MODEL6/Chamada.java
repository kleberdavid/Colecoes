package MODEL6;

import java.util.Scanner;

public class Chamada {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("**Lista de Presença de Alunos** ");
        System.out.println("--------------------------------");

        String alunos[] = {"Aline Silva", "Beto Santos", "daniel Souza"};
        String Dia[] = {"26/08/2021", "27/08/2021", "28/08/2021"};

        String Chamada [][] = new String[Dia.length][alunos.length];


        for (int i = 0; i < Dia.length; ++i) {
            System.out.println("Presença do dia: " + Dia[i]);
            for (int x = 0; x < alunos.length; ++x) {
                System.out.print("Nome: " + alunos[x] + " Está Presente?: ");
                String Prt = scanner.next();

                if (Prt.equals("sim")) {
                    System.out.println("Presente");

                } else {
                    System.out.println("Faltou");


                }

            }

        }
    }
}







































