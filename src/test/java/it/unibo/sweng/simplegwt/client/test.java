package it.unibo.sweng.simplegwt.client;



import static org.mockito.Mockito.mock;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.gwt.junit.client.GWTTestCase;

import it.unibo.sweng.simplegwt.server.GreetingServiceImpl;

public class test{

	static GreetingServiceImpl tryTest;
	
	@Before
	public void ready()
	{
		GreetingService i=mock(GreetingService.class);
		tryTest=new GreetingServiceImpl();
		tryTest.setMock(i);
	}
	
	
	@Test
	public void testStart() {
		tryTest.tryUser();
	}
	
	
	@Test
	public void testRegistrazione()
	{
		ArrayList<String> utenti=new ArrayList<String>();
		utenti.add("ciao");
		utenti.add("ciao");
		utenti.add("ciao");
		System.out.println(tryTest.registrazioneUtente(utenti));
	}
	
}
