package poly_evaluation.metier;

import java.util.List;

import poly_evaluation.entities.Facture;

public interface IFacture {
	
	
	public List<Facture> allFactures();
	public Facture getFacture(int id);
	public void addFacture(Facture p);
	public List<Facture> getFacturesEncours(String etat);

}
