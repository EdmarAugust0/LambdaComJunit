package br.com.edmar;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestGenero {

    @Test
    public void testFiltrarPessoasPorGenero() {

    	Pessoa pessoa1 = new Pessoa("Edmar", "M");
		Pessoa pessoa2 = new Pessoa("Ana", "F");
		Pessoa pessoa3 = new Pessoa("Fábio", "M");
		Pessoa pessoa4 = new Pessoa("Ednea", "F");
		Pessoa pessoa5 = new Pessoa("Beatriz", "F");
		
		List<Pessoa> pessoas = Arrays.asList(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);

        ComLambda comLambda = new ComLambda();

        List<String> resultado = comLambda.filtrarPessoasPorGenero(pessoas, "F");

        assertEquals(Arrays.asList("Ana", "Ednea", "Beatriz"), resultado);
    }
}
