public class Aula5Matriz {
    public static void main(String[] args) {// montar uma tabela em memória!!!

        int [][] calendario = new int[5][7];
        int dia = 0;
        for (int i= 0; i < 5; i++){

            for (int x = 0; x < 7; x++){
                dia++;
                calendario[i][x] = dia;
            }
        }
        for (int i = 0; i < calendario.length; i++){
            for (int x = 0; x < calendario[i].length; x++){
                System.out.print(calendario[i][x] + " ");
            }
            System.out.println("");
        }
    }

}
