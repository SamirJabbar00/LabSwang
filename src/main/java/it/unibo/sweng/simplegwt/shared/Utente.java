package it.unibo.sweng.simplegwt.shared;

import java.io.Serializable;

public class Utente implements Serializable{

	private String email;
	private String password;
	private String nome;
	private int Id;
	//TODO: ArrayList di Deck
	//TODO: ArrayList di Possessi
	//TODO: ArrayList di Desideri
	//TODO: ArrayList di Richieste
	
	public Utente()
	{
		
	}
	
	public Utente(String email, String password, String nome,int Id) {
		this.password = password;
		this.email = email;
		this.nome = nome;
		this.Id=Id;
	}
	

	public String getEmail(){
		return this.email;		
	}
	
	public String getPw(){
		return this.password;
	}
	

	public String getNome(){
		return this.nome;		
	}
	
	public int getId(){
		return this.Id;		
	}
	
	public int setId(int Id){
		return this.Id=Id;		
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
