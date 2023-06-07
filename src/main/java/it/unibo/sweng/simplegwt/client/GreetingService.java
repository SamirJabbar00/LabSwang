package it.unibo.sweng.simplegwt.client;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {


  String getDatabase() throws IllegalArgumentException;
  
  String registrazioneUtente(ArrayList<String> dati) throws IllegalArgumentException;
  
  String deleteUtente(String email) throws IllegalArgumentException;
  
}


