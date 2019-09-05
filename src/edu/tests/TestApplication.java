package edu.tests;

import edu.models.Application;

public class TestApplication {

	public static void main(String[] args) {
		Application.create();
		Application.instance.getUtilisateurs().get(0).addToGroup("Animaux");
		Application.instance.getUtilisateurs().get(0).addToGroup("Heros");
		Application.instance.getUtilisateurs().get(0).addToGroup("Heros");
		Application.instance.getUtilisateurs().get(0).addToGroup("Bidon");
		System.out.println(Application.instance);
	}

}
