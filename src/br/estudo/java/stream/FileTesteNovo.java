package br.estudo.java.stream;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileTesteNovo {

	private String nome = "/dados/teste.txt";

	public static void main(String[] args) {
		new FileTesteNovo().readFileNovo2();
	}

	public void readFileNovo1() {
		try (Stream<String> stream = Files.lines(Paths.get(nome), StandardCharsets.ISO_8859_1)) {
			stream.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFileNovo2() {
		List<String> lista = new ArrayList<>();
		try (Stream<String> stream = Files.lines(Paths.get(nome), StandardCharsets.ISO_8859_1)) {
			lista = stream
					.filter(line -> line.startsWith("t"))
					.map(String::toUpperCase)
					.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}

		lista.forEach(System.out::println);
	}
}
