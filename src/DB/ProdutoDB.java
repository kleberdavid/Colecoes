package DB;///esse é a classe de produtos criados!!!

import models.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDB {

    private List<Produto> produtoList = new ArrayList<>();

    public List<Produto> getProdutoList() {//criamos metodo getter para retornar a lista produtoList!!

        return produtoList;
    }
    public void addNovoProduto(Produto produto) {//metodo para adicionar novos produtos a esta lista!!

        produtoList.add(produto);
    }
}
