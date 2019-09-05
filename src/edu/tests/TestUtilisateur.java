package edu.tests;

import edu.models.Utilisateur;

public class TestUtilisateur {
	public static void main(String[] args) {
		Utilisateur user=new Utilisateur("Zorro");
		System.out.println(user.getLogin());
		user.setLogin("Bernardo");
		user.postLogin();
		user.postLogin();
		user.postLogin();
		
		System.out.println(user);
		
		
	}
}
