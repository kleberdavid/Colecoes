package models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) throws Exception {

        System.out.println("---Pedido de Vendas----");
        
        int option;
        do{
            System.out.println("** 1 - Cadastrar produto ");
            System.out.println("** 0 - Sair ");

            Scanner scanner = new Scanner(System.in);
            System.out.print("---Digite a operação desejada: ");
            option = scanner.nextInt();

            process(option);
            
        }while(option != 0);
            

    }
    public static void process(int option) throws Exception {
        switch (option){
            case 1: {
                Scanner scanner= new Scanner(System.in);

                System.out.print("--Qual a Descrição que você deseja dar ao Produto: ");
                String descricao = scanner.nextLine();

                System.out.print("--Qual o ID você deseja dar ao novo Produto: ");
                int id = scanner.nextInt();

                System.out.print("--Qual o Preco do Produto: ");
                double preco = scanner.nextDouble();

                System.out.print("--Qual a Data de Validade de Produto: ");
                String dataString = scanner.next();

                Date dataValidade = new SimpleDateFormat("DD/MM/yyyy").parse(dataString);

                Produto novoProduto = new Produto(descricao, id, preco, dataValidade);
                System.out.println();

                System.out.println("-----Produto criado com Sucesso-----");
                System.out.println("---Descrição do produto: " + novoProduto.getDescricao());
                System.out.println("---ID do Produto: " + novoProduto.getId());
                System.out.println("---Preço do produto: " + novoProduto.getPreco());
                System.out.println("---Data de validade de produto: " + novoProduto.getDatavalidade());
                System.out.println("------------------------------------------------------");
                System.out.println("--------FIM-------");


            


            }
        }
    }


}
