package models;

public abstract class Usuario {///Não pode ser instanciada!!classe abstrata!!!

    private int id;//atributos
    private String nome;//atributos
    private TipoUsuario tipoUsusario;//atributos

    public Usuario( String nome, TipoUsuario tipoUsusario) {//receber 2 argumentos!!!aqui é um construtor
        this.nome = nome;
        this.tipoUsusario = tipoUsusario;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public TipoUsuario getTipoUsusario() {
        return tipoUsusario;
    }
    public void setTipoUsusario(TipoUsuario tipoUsusario) {
        this.tipoUsusario = tipoUsusario;
    }
}
