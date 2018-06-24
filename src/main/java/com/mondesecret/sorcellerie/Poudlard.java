package com.mondesecret.sorcellerie;

import java.util.Scanner;

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
	
	/** Constructeur */
	public Poudlard() {
		System.out.println("Welcome in Hogwart!\n");
		Scanner sc = new Scanner(System.in);
		eleve.setNom(sc.next());
		eleve.setPrenom(sc.next());
		eleve.setSexe();
		inscriptionEleve(eleve.getNom(), eleve.getPrenom(), eleve.getSexe());
	}
	    
	/** This method provides to inscribe the news students
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param maison
	 */
	public void inscriptionEleve(final String nom, final String prenom, final Sexe sexe){
		Maison maison;
		String choixpeau = eleve.getMaison().toString();
		eleve.setNom(nom);
		eleve.setPrenom(prenom);
		eleve.setSexe(sexe);
			
		switch(choixpeau){
			case "G" : maison.GRYFFINDOR.toString();
				break;
			case "R" : maison.RAVENCLAW.toString();
				break;
			case "H" : maison.HUFFLEPUFF.toString();
				break;
			case "S" : maison.SLYTHERIN.toString();
				break;
			default : "Invalid Home";
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
