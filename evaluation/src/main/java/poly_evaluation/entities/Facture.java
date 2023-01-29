package poly_evaluation.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

@Entity
public class Facture implements Serializable {

	@Id
	@GeneratedValue()
	private int numero_fact;
	private double montant;
	private String etat;
	private Date date_fact;

	public Facture() {
		super();
	}
	
	public Facture(int numero_fact, double montant, String etat, Date date_fact) {
		super();
		this.numero_fact = numero_fact;
		this.montant = montant;
		this.etat = etat;
		this.date_fact = date_fact;
	}
	
	public int getNumero_fact() {
		return numero_fact;
	}
	
	public void setNumero_fact(int numero_fact) {
		this.numero_fact = numero_fact;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Date getDate_fact() {
		return date_fact;
	}
	public void setDate_fact(Date date_fact) {
		this.date_fact = date_fact;
	}
	
	
	
}
