package edu.models;

public class UtilisateurC extends Utilisateur {
	private Contrat contrat;
	
	public UtilisateurC(String login) {
		super(login);
		
	}
	
	public void addContrat() {
		contrat=new Contrat(this);
	}
	
	@Override
	public String toString() {
		return super.toString()+contrat;
	}

}
