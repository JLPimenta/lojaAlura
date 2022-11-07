package br.com.loja.DAO;

import javax.persistence.EntityManager;

import br.com.loja.model.Produto;

public class ProdutoDAO {

    private EntityManager em;

    public ProdutoDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Produto produto) {
        this.em.persist(produto);
    }
}
