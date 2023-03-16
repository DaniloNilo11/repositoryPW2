package ifto.edu.aula04.model.repository.repositoryProduto;

import java.util.List;

import org.springframework.stereotype.Repository;

import ifto.edu.aula04.model.entity.produto.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class RepositoryProduto {
  
  @PersistenceContext
  private EntityManager em;

  public List<Produto> produtos(){

    Query query = em.createQuery("from Produto");
    return query.getResultList();
    
  }
}
