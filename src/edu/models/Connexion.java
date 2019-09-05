package edu.models;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.util.Date;

public class Connexion {
	private String ip;
	private Date date;
	private Utilisateur utilisateur;
	
	public Connexion(Utilisateur utilisateur) throws UnknownHostException {
		this.utilisateur=utilisateur;
		this.date=new Date();
		this.ip=InetAddress.getLocalHost().toString();
	}

	@Override
	public String toString() {
		return DateFormat.getInstance().format(date)+"@"+ip;
	}
}
