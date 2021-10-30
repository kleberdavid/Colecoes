package models;

public class Admin extends Usuario{//Classe filha!!

    public Admin(String nome) {//construtor
        super(nome, TipoUsuario.Admin);//chamar o construtor da classe Pai!!!(super).
    }
}


