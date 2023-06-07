package it.unibo.sweng.simplegwt.server;

import it.unibo.sweng.simplegwt.shared.Card;
import it.unibo.sweng.simplegwt.shared.CardMagic;
import it.unibo.sweng.simplegwt.shared.CardPokemon;
import it.unibo.sweng.simplegwt.shared.CardYugi;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import org.mapdb.BTreeMap;
import org.mapdb.DB;
import org.mapdb.DBMaker;



public class DbCard {

	//Attenzione a come vengono letti i file dal json (soprattutto con gli enum che sul json possono essere formati 
	//anche da più parole mentre nelle classi Enum ci sono solo parole singole)
	
	//Attenzione perchè nel json Magic la rarità ha iniziale minuscola, in json Pokemon maiuscola
	
	
	
}
