package it.unibo.sweng.simplegwt.client;



import java.util.ArrayList;

import org.junit.Test;

import com.google.gwt.junit.client.GWTTestCase;

import it.unibo.sweng.simplegwt.server.GreetingServiceImpl;

public class test  {

	static GreetingServiceImpl tryTest=new GreetingServiceImpl();
	
	
	
	@Test
	public void testStart() {
		tryTest.tryUser();
	}
	
	@Test
	public void InsertUser() {
		ArrayList<String> dati=new ArrayList<String>();
		dati.add("ciao");
		dati.add("bello");
		dati.add("pino");
		tryTest.deleteUtente("ciao");
		System.out.println(tryTest.registrazioneUtente(dati));
		
	}
}
