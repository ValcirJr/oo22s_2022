package br.edu.utfpr.entity;

import java.time.LocalDate;

public class Entity {

    private Long id;
    private LocalDate ultimaModificacao;

    public Entity() {
    }

    public Entity(Long id) {
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUltimaModificacao(LocalDate ultimaModificacao) {
        this.ultimaModificacao = ultimaModificacao;
    }
}
