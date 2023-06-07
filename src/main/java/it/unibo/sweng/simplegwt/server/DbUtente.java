package it.unibo.sweng.simplegwt.server;

import it.unibo.sweng.simplegwt.shared.Utente;


import javax.servlet.ServletContext;

import org.mapdb.BTreeMap;
import org.mapdb.DB;
import org.mapdb.DBMaker;
import org.mapdb.Serializer;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;


//Nel db Utente si usa una BTreeMap dove ogni nodo è una coppia Stringa-Utente (la string aè la mail di quell'utente)

public class DbUtente extends RemoteServiceServlet{

	
	private DB getDB() {
           
		//PROBLEMA->Il Servlet che chiamo qua con il 'this' non è stato inizializzato
		
			DB	db = DBMaker.fileDB(new File("dbUtente")).closeOnJvmShutdown().make();
			return db;
		
	}
			
		

	
	//-----Registrazione utente-----------
	public String registrazioneUtente(ArrayList<String> dati) {
		DB db = getDB();
		BTreeMap<String,Utente> Users;

		Users = db.treeMap("UtentiMap", Serializer.STRING, Serializer.JAVA).createOrOpen();
		//prima di inserire l'utente nel db controllo che la mail (che si trova in posizione 0 dell'arraylist) sia corretta
		boolean find = false;
		for(Entry<String,Utente> test : Users.entrySet()) {
			if(test.getValue().getEmail().equalsIgnoreCase(dati.get(0))) {
				find = true;
			}
		}
		
		if(!find)
		{
			int id=Users.size()+1;

			//creo un nuovo utente passandogli email, password e nome
			Utente user = new Utente(dati.get(0),dati.get(1),dati.get(2),id);

			Users.put(user.getEmail(),user);
			
			db.commit();
			db.close();
			return "Registrazione completata";
		}
		else
			{
			
			db.commit();
			db.close();
			return "Errore";
			}
	}

	
	
	
	
	//--LOGIN Utente--------------
	public Utente login(String email, String password) throws IllegalArgumentException{

		DB db = getDB();
		BTreeMap<String,Utente> Users = db.treeMap("UtentiMap", Serializer.STRING, Serializer.JAVA).createOrOpen();
		
		//ciclo per il controllo della mail nel db
		boolean find = false;
		for(Entry<String,Utente> test : Users.entrySet()) {
			if(test.getValue().getEmail().equalsIgnoreCase(email)) {
				find = true;
			}
		}
		//se l'ho trovata ritorno l'utente che ha fatto l'accesso
		if(find){
			Utente user = Users.get(email);
			if(user.getPw().equals(password)) {
				return user;
				
			}else return null;
		}else return null;
	}

	//------Eliminazione utente---------------
	public String deleteUtente(String email) {
		DB db = getDB();
		BTreeMap<Integer, Utente> utenti = db.treeMap("UtentiMap", Serializer.STRING, Serializer.JAVA).createOrOpen();

		utenti.remove(email);
		db.commit();
		db.close();

		return "Successo";
	}

	
	//------Visualizzo info utente--------------
	public String getInfoUtente(String email) {
		DB db = getDB();
		BTreeMap<String, Utente> Users = db.treeMap("UtentiMap", Serializer.STRING, Serializer.JAVA).createOrOpen();

		Utente user = Users.get(email);

		String all = "Email :" + user.getEmail() + "\nPassword : " + user.getPw() + "\nId : "+ user.getId()+ "\nNome : " + user.getNome() ;
		return all;
	}

	//-----Ottieni utente dalla mail------------
	public Utente getUtente(String email) {
		DB db = getDB();
		BTreeMap<String, Utente> Users = db.treeMap("UtentiMap", Serializer.STRING, Serializer.JAVA).createOrOpen();
		Utente user = Users.get(email);
		return user;

	}

		
	//-----Ritorna gli utenti---------------------
	public ArrayList<Utente> getUtentiAll(){
		DB db = getDB();
		BTreeMap<String, Utente> Users = db.treeMap("UtentiMap", Serializer.STRING, Serializer.JAVA).createOrOpen();
		ArrayList<Utente> output = new ArrayList<Utente>();
		for(Entry<String,Utente> test : Users.entrySet()) {
			output.add(test.getValue());
		}
		
		return output;
	}
	
	
	//------Ritorna una stringa di tutte le entry del db----------
	public String getDatabase() {
		DB db = getDB();
		String s = "";
		for(Entry<String,Object> test : db.getAll().entrySet()) {
			s += test.getValue().toString() + " | ";
		}

		return s;
	}

	//Modifica Utente passandogli la mail 
	//In posizione 0 della lista la nuova password, in posizione 1 il nuovo nome
	//La mail e l'id non sono modificabili. Se la posizione della lista è vuota vuol dire che quell'attributo non dev'essere modificato
	public String modificaUtente(ArrayList<String> dati, String email) {
		DB db = getDB();
		BTreeMap<String, Utente> utenti = db.treeMap("UtentiMap", Serializer.STRING, Serializer.JAVA).createOrOpen();

		Utente utente = utenti.get(email);
		utenti.remove(email);
		if(dati.get(0).length()>=1)
		{
			utente.setPassword(dati.get(0));
		}
		
		if(dati.get(1).length()>=1)
		{
			utente.setNome(dati.get(2));
		}
		
		

		utenti.put(email, utente);
		db.commit();
		db.close();

		return "Successo";

	}

	
	public void tryUser() {
		DB db = getDB();
		BTreeMap<String, Utente> utenti = db.treeMap("UtentiMap", Serializer.STRING, Serializer.JAVA).createOrOpen();

		Utente user = new Utente("ciao","ciao","ciao",1);
		utenti.put(user.getEmail(), user);
		db.commit();
		db.close();
	}
	
}
