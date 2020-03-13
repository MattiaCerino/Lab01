package it.polito.tdp.parole.model;

import java.util.*;
import java.util.List;

public class Parole {
	
	Map<String, String> mappaParole = new TreeMap<String, String>();
	LinkedList<String> listaParole = new LinkedList<String>();
	
	public Parole() {
	}
	
	public void addParola(String p) {
		listaParole.add(p);
		mappaParole.put(p, p);
	}
	
	public List<String> getElenco() {
		LinkedList<String> elencoParole = new LinkedList<String>(mappaParole.keySet());
		return elencoParole;
	}
	
	public void reset() {
		mappaParole.clear();
	}

}
