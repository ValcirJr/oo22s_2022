package br.edu.utfpr;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class LocacaoService {

    public void efetuarLocacao(Pessoa pessoa, List<Integer> livrosId) {
        if(validaSeEstaDisponivel(livrosId))
            System.out.println("Há algum livro indisponivél");
        else {
            BancoDeDados.locacoes.add(
                    new Locacao(pessoa,
                            getLivrosById(livrosId),
                            LocalDateTime.now(),
                            ChronoUnit.DAYS.addTo(LocalDateTime.now(), 30))
            );
        }
    }

    private boolean validaSeEstaDisponivel(List<Integer> livrosId) {
        return getLivrosById(livrosId).stream()
                .map(livro -> livro.getDisponivel())
                .anyMatch(disponivel -> disponivel == false);
    }

    private List<Livro> getLivrosById(List<Integer> livrosId) {
        return livrosId.stream().map( id ->
                BancoDeDados.livros.stream()
                        .filter(livro -> livro.getId() == id)
                        .findFirst().get()
        ).toList();
    }

}
