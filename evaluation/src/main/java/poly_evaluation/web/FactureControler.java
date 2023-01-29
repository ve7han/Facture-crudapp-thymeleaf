package poly_evaluation.web;
import java.security.Principal;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import poly_evaluation.metier.FactureService;


@Controller
public class FactureControler {

	
	@Autowired
	private FactureService fact_service;
	
	
	@Secured(value = {"ROLE_ADMIN"})
	@GetMapping( "/factures")
	public String tous_facture(Model model){
		model.addAttribute("factures",fact_service.allFactures() );
		return "tousfactures";
	}
	
	@Secured(value = {"ROLE_VISITEUR","ROLE_ADMIN"})
	@GetMapping( "/factures_visiteur")
	public String visiteur_facture(Model model){
		model.addAttribute("factures",fact_service.getFacturesEncours("non payée") );
		return "tousfactures";
	}
	
	
	
	
	
}
