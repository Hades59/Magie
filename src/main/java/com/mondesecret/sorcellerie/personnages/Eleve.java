package com.mondesecret.sorcellerie.personnages;


public class Eleve extends Personnages {
	/** sexe : Sexe */
	private Sexe sexe;
	/** maison : Maison */
	private Maison maison;
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
	 * @return the maison
	 */
	public Maison getMaison() {
		return maison;
	}
	/**
	 * @param maison the maison to set
	 */
	public void setMaison(Maison maison) {
		this.maison = maison;
	}
	/**
	 * @return the sexe
	 */
	public Sexe getSexe() {
		return sexe;
	}
	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
}
