package com.mondesecret.sorcellerie.personnages;

public class Professeur extends Personnages{
	/** sexe : Sexe */
	private Sexe sexe;
	/** matiere : String */
	private String matiere;
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the sexe
	 */
	public Sexe getSexe() {
		return sexe;
	}
	/**
	 * @return the matiere
	 */
	public String getMatiere() {
		return matiere;
	}
	/**
	 * @param matiere the matiere to set
	 */
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
}
