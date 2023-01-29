package poly_evaluation.metier;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poly_evaluation.dao.IFactureRepos;
import poly_evaluation.entities.Facture;
@Service
public class FactureService implements IFacture {
	
	@Autowired
	IFactureRepos facture_repos;

	@Override
	public List<Facture> allFactures() {
		return  facture_repos.findAll();
	}

	@Override
	public Facture getFacture(int id) {
		return facture_repos.getById(id);
	}

	@Override
	public void addFacture(Facture facture) {
		facture_repos.save(facture);
		
	}

	@Override
	public List<Facture> getFacturesEncours(String etat) {
		return facture_repos.findAllByEtat(etat);
	}
	
	
	

	
}
