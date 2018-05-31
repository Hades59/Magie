package com.mondesecret.sorcellerie;

import com.mondesecret.sorcellerie.personnages.Eleve;
import com.mondesecret.sorcellerie.personnages.Maison;
import com.mondesecret.sorcellerie.personnages.Professeur;
import com.mondesecret.sorcellerie.personnages.Sexe;

/**
 *This is the wizard school
 */
public class Poudlard {
	
	/** eleve : Eleve */
	private Eleve 		eleve 		= new Eleve();
	/** professeur : Professeur */
	private Professeur 	professeur 	= new Professeur();
	
	public Poudlard() {
		System.out.println("coucou");
	}
	    
	/** This method provides to inscribe the news students
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param maison
	 */
	public void inscriptionEleve(final String nom, final String prenom, final Sexe sexe, final Maison maison){
			eleve.setNom(nom);
			eleve.setPrenom(prenom);
			eleve.setSexe(sexe);
			switch(eleve.getMaison()){
				case 'G' : maison.GRYFFINDOR;
					break;
				case 'R' : maison.RAVENCLAW;
					break;
				case 'H' : maison.HUFFLEPUFF;
					break;
				case 'S' : maison.SLYTHRIN;
					break;
			}
	}
	
	/** This method provides to inscribe the teachers
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param matiere
	 */
	public void inscriptionProfesseur(final String nom, final String prenom, final Sexe sexe, final String matiere){
		professeur.setNom(nom);
		professeur.setPrenom(prenom);
		professeur.setSexe(sexe);
		professeur.setMatiere(matiere);
	}
}
