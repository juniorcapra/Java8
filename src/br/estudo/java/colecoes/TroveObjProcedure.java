package br.estudo.java.colecoes;

import gnu.trove.procedure.TObjectProcedure;

public class TroveObjProcedure implements TObjectProcedure<String>{

	@Override
	public boolean execute(String obj) {
		
		System.out.println("Tamanho do objeto " + obj.length());
		return true;
	}

}
