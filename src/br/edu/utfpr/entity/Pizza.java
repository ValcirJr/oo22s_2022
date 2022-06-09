package br.edu.utfpr.entity;

import br.edu.utfpr.enums.Tamanho;

public class Pizza extends Entity {

    private String sabores;
    private Tamanho tamanho;

    public Pizza(Long id, Tamanho tamanho) {
        super(id);
        this.tamanho = tamanho;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }
}
