package ifto.edu.aula04.controller.controllerItemProduto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifto.edu.aula04.model.repository.repositoryItemProduto.RepositoryItemProduto;

@Transactional
@Controller
@RequestMapping("itens")
public class ControllerItemProduto {
  @Autowired
  RepositoryItemProduto repositoryItemProduto;

  @GetMapping("/list")
  public String list(ModelMap modelMap){
    modelMap.addAttribute("itens" , repositoryItemProduto.itemProdutos() );
    return "/itemProduto/list";

  }
  
}
