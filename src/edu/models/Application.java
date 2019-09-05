package edu.models;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static Application instance;
	private List<Groupe> groupes;
	private List<Utilisateur> utilisateurs;

	private void addUSers(String...userNames) {
		for(String name:userNames) {
			utilisateurs.add(new Utilisateur(name));
		}
		
	}
	
	private void addGroupes(String...groupNames) {
		for(String name:groupNames) {
			groupes.add(new Groupe(name));
		}
		
	}
	
	public Application() {
		groupes=new ArrayList<>();
		utilisateurs=new ArrayList<>();
	}
	
	public List<Groupe> getGroupes() {
		return groupes;
	}

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	/**
	 * Ajoute des utilisateurs et des groupes à une nouvelle instance d'application
	 */
	public static Application create() {
		instance=new Application();
		instance.addUSers("zorro","bernardo","Garcia","Jolly jumper","Rantanplan");
		instance.addGroupes("Animaux","Heros","Perso secondaires");
		return instance;
	}


	
	@Override
	public String toString() {
		return "Application [groupes=" + groupes + ", utilisateurs=" + utilisateurs + "]";
	}
}
