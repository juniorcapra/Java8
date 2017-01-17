package br.estudo.java.colecoes;

import gnu.trove.function.TObjectFunction;
import gnu.trove.procedure.TObjectProcedure;

public class TroveObjFunction implements TObjectFunction<String,String>{

	@Override
	public String execute(String valor) {
		// TODO Auto-generated method stub
		return "Meu nome é:" + valor;
	}



}