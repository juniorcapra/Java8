package br.estudo.java.lambda;

import java.util.function.BinaryOperator;

public class Calc {

	public static double calcular(double x, double y, BinaryOperator<Double> binaryOperator) {
		return binaryOperator.apply(x, y);
	}
	
}
