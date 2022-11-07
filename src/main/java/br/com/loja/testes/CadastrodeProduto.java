package br.com.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import br.com.loja.DAO.ProdutoDAO;
import br.com.loja.model.Categoria;
import br.com.loja.model.Produto;
import br.com.loja.util.JPAUtil;

public class CadastrodeProduto {

    public static void main(String[] args) {

        Categoria celulares = new Categoria("CELULARES");
        Produto celular = new Produto("Xiaomi Redmi", "UGA UGA", new BigDecimal(800), celulares);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO dao = new ProdutoDAO(em);

        em.getTransaction().begin();
        dao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }
}