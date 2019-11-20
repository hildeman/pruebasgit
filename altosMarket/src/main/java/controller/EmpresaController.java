package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.ModelAndView;

import model.Empresa;
import service.EmpresaService;

@Controller
public class EmpresaController {
	
	
	@Autowired
	private EmpresaService empresaService; 

	
	// controlador para listar empresa
	
	@RequestMapping(value="/empresa")
    public String productList(Model model) {
        model.addAttribute("empresaList", empresaService.empresatList());
        return "empresa";
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

}
