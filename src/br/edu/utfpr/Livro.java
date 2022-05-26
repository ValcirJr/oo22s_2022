package br.edu.utfpr;

public class Livro {

    private Integer id;
    private String titulo;
    private Boolean disponivel;

    public Livro(Integer id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.disponivel = true;
    }

    public Integer getId() {
        return id;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }
}
