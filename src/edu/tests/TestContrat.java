package edu.tests;

import java.util.ArrayList;
import java.util.List;

import edu.models.Utilisateur;
import edu.models.UtilisateurC;

public class TestContrat {

	public static void main(String[] args) {
		List<Utilisateur> users=new ArrayList<>();
		UtilisateurC bambi=new UtilisateurC("Bambi");
		bambi.addContrat();
		users.add(bambi);
		
		Utilisateur garcia=new Utilisateur("St Garcia");
		users.add(garcia);
		for(Utilisateur u:users) {
			System.out.println(u.tos);
		}
		
	}

}
