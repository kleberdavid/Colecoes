package models;

public class Cliente extends Usuario {//Classe filha!

    public Cliente(String nome) {//construtor
        super(nome, TipoUsuario.Cliente);//chamar o construtor da Classe Pai!!!(super).

    }
}
