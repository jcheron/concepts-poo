package edu.models;

public class Groupe {
	private String nom;
	public Groupe(String name) {
		nom=name;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return nom;
	}
}
