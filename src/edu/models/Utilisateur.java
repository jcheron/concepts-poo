package edu.models;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
	private String login;
	private String password;
	private int age;
	private List<Groupe> groupes;
	private List<Connexion> connexions;

	/**
	 * @param login
	 */
	public Utilisateur(String login) {
		this.login = login;
		connexions=new ArrayList<>();
		groupes=new ArrayList<>();
	}
	
	/**
	 * Méthode post connexion de l'utisateur à l'application
	 * Ajoute une instance de connexion dans les connexions de l'utilisateur
	 */
	public void postLogin() {
		try {
			connexions.add(new Connexion(this));
		} catch (UnknownHostException e) {
			System.out.println("Problème de connexion, impossible de récupérer l'adresse IP client");
		}
		
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	


	@Override
	public String toString() {
		return login+connexions+groupes;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(!(age<0 || age>=130)) {
			this.age = age;
		}
	}
	
	/**
	 * Ajoute l'utilisateur en cours au groupe de nom nomGroupe
	 * @param nomGroupe
	 * @return true si l'utilisateur a été ajouté au groupe
	 */
	public boolean addToGroup(String nomGroupe) {
		for(Groupe groupe:Application.instance.getGroupes()) {
			if(nomGroupe.equals(groupe.getNom()) && !groupes.contains(groupe)) {
				groupes.add(groupe);
				return true;
			}
		}
		return false;
	}

}
