package ifto.edu.aula04.model.entity.itemProduto;

import java.io.Serializable;

import ifto.edu.aula04.model.entity.produto.Produto;
import ifto.edu.aula04.model.entity.venda.Venda;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class ItemProduto implements Serializable {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Long id;

  @OneToOne
  private Produto produto;

  private double  quantidadeProduto;

  @ManyToOne
  private Venda venda;

  public Produto getProduto() {
    return produto;
  }

  public void setProduto(Produto produto) {
    this.produto = produto;
  }

  public double getQuantidadeProduto() {
    return quantidadeProduto;
  }

  public void setQuantidadeProduto(double quantidadeProduto) {
    this.quantidadeProduto = quantidadeProduto;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Venda getVenda() {
    return venda;
  }

  public void setVenda(Venda venda) {
    this.venda = venda;
  }
  

  public double totalItem(){
    return quantidadeProduto * produto.getValor();
  }
  
}
