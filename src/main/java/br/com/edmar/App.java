package br.com.edmar;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Edmar", "M");
		Pessoa pessoa2 = new Pessoa("Ana", "F");
		Pessoa pessoa3 = new Pessoa("Fábio", "M");
		Pessoa pessoa4 = new Pessoa("Ednea", "F");
		Pessoa pessoa5 = new Pessoa("Beatriz", "F");
		
		List<Pessoa> pessoas = Arrays.asList(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);
		
		ComLambda comLambda = new ComLambda();
		
		List<String> nomeFemininos = comLambda.filtrarPessoasPorGenero(pessoas, "F");
		
		nomeFemininos.forEach(System.out::println);
	}
}
