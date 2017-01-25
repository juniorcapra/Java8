package br.estudo.java.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

public class LambdaTestes {

	private static JButton button = new JButton("Teste");
	
private static List<String> lista = Arrays.asList(new String[] {"F", "Z", "A", "G", "B", "C"});

	public static void main(String[] args) {
		double soma = Calc.calcular(40d, 20d, (x, y) -> x + y);
		System.out.println(soma);
		
		lista.stream().forEachOrdered(s -> System.out.println(s));
		
//		long cont = lista.stream().filter(s -> s.equals("B")).count();
//		System.out.println(cont);
	}

	private void initButton() {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botão clicado!");
				System.out.println("Botão clicado 2!");
			}
		});
	}

	private void initButtonLambda() {
		button.addActionListener((event) -> imprimeTexto(event));
	}

	private void imprimeTexto(ActionEvent event) {
		System.out.println("Botão Clicado!");
		System.out.println("Botão clicado 2!");
	}

}
