package edu.models;

import java.util.Date;
import java.util.UUID;

public class Contrat {
	private String code;
	private Date dateS;
	private UtilisateurC utilisateur;
	
	public Contrat(UtilisateurC utilisateur) {
		this.utilisateur=utilisateur;
		this.dateS=new Date();
		code=UUID.randomUUID().toString();
	}

	public String getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "Contrat [code=" + code + ", dateS=" + dateS + "]";
	}

	public Date getDateS() {
		return dateS;
	}

	public UtilisateurC getUtilisateur() {
		return utilisateur;
	}
}
