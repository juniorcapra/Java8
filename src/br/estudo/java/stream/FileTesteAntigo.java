package br.estudo.java.stream;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileTesteAntigo {

	public static void main(String[] args) {
		new FileTesteAntigo().readFileAntigo2();
		//new FileTesteAntigo().readFileAntigo1();
	}

	public void readFileAntigo1() {
		try {
			FileReader fileReader = new FileReader(new File("/dados/teste.txt"));

			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String linha = null;
			while ((linha = bufferedReader.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFileAntigo2() {
		try {
			List<String> lista = Files.readAllLines(Paths.get("/dados/teste.txt"), StandardCharsets.ISO_8859_1);
			for (String linha : lista) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
