package poly_evaluation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import poly_evaluation.entities.Facture;

public interface IFactureRepos extends JpaRepository<Facture , Integer> {
	
	List<Facture> findAllByEtat(String etat);
	

}
