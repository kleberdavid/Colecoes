package DB;

import models.Admin;
import models.Cliente;
import models.Produto;
import models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    static ProdutoDB produtoDB = new ProdutoDB();//instanciou!!!
    static UsuariosDB usuariosDB = new UsuariosDB();//intanciei!!

    public static void main(String[] args) throws Exception {


        System.out.println("---Pedido de Vendas----");
        System.out.println();

        int option;
        do{
            System.out.println("---Qual opção deseja realizar?: ");
            System.out.println();
            System.out.println("** 1 - Cadastrar produto ");
            System.out.println("** 2 - Listar produtos cadastrados ");
            System.out.println("** 3 - Cadastrar Usuario Administrador ");
            System.out.println("** 4 - Cadastrar Usuario Cliente ");
            System.out.println("** 5 - Listar todos os Usuarios cadastrados ");
            System.out.println("** 0 - Sair ");
            System.out.println();

            Scanner scanner = new Scanner(System.in);
            System.out.print("---Digite a operação desejada: ");
            option = scanner.nextInt();
            System.out.println();

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
                produtoDB.addNovoProduto(novoProduto);

                break;

            }
            case 2: {
                List<Produto> listadeProdutos = produtoDB.getProdutoList();

                for (Produto produto : listadeProdutos){
                    System.out.println("---Descrição do produto: " + produto.getDescricao());
                    System.out.println("---ID do Produto: " + produto.getId());
                    System.out.println("---Preço do produto: " + produto.getPreco());
                    System.out.println("---Data de validade de produto: " + produto.getDatavalidade());
                    System.out.println("------------------------------------------------------");

                }
                break;
            }
            case 3: {
                Scanner scanner= new Scanner(System.in);
                System.out.print("Qual o nome do usuario Administrador: ");
                String nome = scanner.nextLine();

                Admin novoAdmin = new Admin(nome);
                usuariosDB.addNovoUsuario(novoAdmin);
                break;
            }
            case 4: {
                Scanner scanner= new Scanner(System.in);
                System.out.print("Qual o nome do usuario Cliente: ");
                String nome = scanner.nextLine();

                Cliente novoCliente = new Cliente(nome);
                usuariosDB.addNovoUsuario(novoCliente);
                break;
            }
            case 5: {//listar todos os ususarios cadastrados""
                System.out.println("----------------------------------------------------");
                System.out.println("-----------Lista de Usuarios Cadastrados------------ ");

                for(Usuario usuario : usuariosDB.getUsuarioList()){
                    System.out.println(" ID: " + usuario.getId());
                    System.out.println(" Nome: " + usuario.getNome());
                    System.out.println(" Tipo: " + usuario.getTipoUsusario());
                    System.out.println("--------------------------------------------------");

                }

                break;
            }
        }
    }


}



