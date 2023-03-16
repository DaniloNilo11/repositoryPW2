package ifto.edu.aula04.model.repository.repositoryItemProduto;

import java.util.List;

import org.springframework.stereotype.Repository;

import ifto.edu.aula04.model.entity.itemProduto.ItemProduto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class RepositoryItemProduto {
  
  @PersistenceContext
  private EntityManager em;

  public List<ItemProduto> itemProdutos(){

    Query query = em.createQuery("from ItemProduto");
    return query.getResultList();
  }
}
