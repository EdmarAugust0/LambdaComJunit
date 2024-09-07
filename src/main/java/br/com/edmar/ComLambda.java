package br.com.edmar;

import java.util.List;
import java.util.stream.Collectors;

public class ComLambda {
    public List<String> filtrarPessoasPorGenero(List<Pessoa> lista, String genero) {
        return lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals(genero))
                .map(Pessoa::getNome)
                .collect(Collectors.toList());
    }
}

