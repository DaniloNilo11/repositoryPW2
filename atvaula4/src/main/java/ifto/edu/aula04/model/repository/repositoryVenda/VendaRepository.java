package ifto.edu.aula04.model.repository.repositoryVenda;

import java.util.List;

import org.springframework.stereotype.Repository;

import ifto.edu.aula04.model.entity.venda.Venda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class VendaRepository {
  
  @PersistenceContext
  private EntityManager em;

  public List<Venda> vendas(){

    Query query = em.createQuery("from Venda");
    return query.getResultList();

  }
}
