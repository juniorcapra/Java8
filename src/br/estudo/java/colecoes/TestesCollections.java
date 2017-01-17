package br.estudo.java.colecoes;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import gnu.trove.map.TMap;
import gnu.trove.map.hash.THashMap;

public class TestesCollections {
	
	
	public static void main(String[] args) {
		
		Map<String,String> mapaJdk =  new HashMap<String, String>();
		long tempo = Calendar.getInstance().getTimeInMillis();
		
		for(int i = 0; i<1000000;i++){
			
			mapaJdk.put("Junior", "SYNCHRO");
			
		}
		
		
		System.out.println(Calendar.getInstance().getTimeInMillis() - tempo);
		
	}

	private static void testaProceduresFunctions() {
		TMap<String, String> mapa = new THashMap<String,String>();
		mapa.put("Junior", "123");
		mapa.put("Juliana", "321");
		
		System.out.println("Processando procedure");
		for(String v : mapa.values()){
			System.out.println(v + "\n");
		}
		
		mapa.forEachValue(new TroveObjProcedure());
		
		mapa.transformValues(new TroveObjFunction());
		
		
		System.out.println("Processando procedure");
		for(String v : mapa.values()){
		
			System.out.println(v);
		}
	}
	
	
	

	
}
