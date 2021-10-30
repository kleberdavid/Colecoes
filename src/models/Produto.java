package models;

import java.util.Date;

public class Produto {

    private String descricao;
    private int id;
    private double preco;
    private Date datavalidade;

    public Produto( String descricao, int id, double preco, Date datavalidade){
        this.descricao = descricao;
        this.id = id;
        this.preco = preco;
        this.datavalidade = datavalidade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getPreco() {
        return preco;
    }
    public Date getDatavalidade() {
        return datavalidade;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setDatavalidade(Date datavalidade) {
        this.datavalidade = datavalidade;
    }
}
