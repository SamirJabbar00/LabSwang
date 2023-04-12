package it.unibo.sweng.simplegwt.server;

import it.unibo.sweng.simplegwt.client.GreetingService;
import it.unibo.sweng.simplegwt.shared.FieldVerifier;

import java.util.ArrayList;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import it.unibo.sweng.simplegwt.server.DbUtente;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {

  
  @Override
	public String getDatabase() throws IllegalArgumentException {
	  DbUtente Db=new DbUtente();
			return Db.getDatabase();
		
	}
  
  
  public void tryUser() {
	  DbUtente Db=new DbUtente();
		Db.tryUser();
	}
  
  public String deleteUtente(String email)
  {
	  DbUtente Db=new DbUtente();
	return Db.deleteUtente(email);
  }
  
  @Override
  public String registrazioneUtente(ArrayList<String> dati) {
	  DbUtente Db=new DbUtente();
		return Db.registrazioneUtente(dati);
	}
  
}
