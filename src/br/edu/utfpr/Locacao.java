package br.edu.utfpr;

import java.time.LocalDateTime;
import java.util.List;

public class Locacao {

    private Pessoa pessoa;
    private List<Livro> livros;
    private LocalDateTime dataInicial;
    private LocalDateTime dataFinal;

    public Locacao(Pessoa pessoa, List<Livro> livros, LocalDateTime dataInicial, LocalDateTime dataFinal) {
        this.pessoa = pessoa;
        this.livros = livros;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }
}
