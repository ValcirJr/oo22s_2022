package br.edu.utfpr.CRUDservice;


import br.edu.utfpr.entity.Entity;

public interface CrudService <T extends Entity> {

    void salvar(T object);

    void remover(Long codigo);

    T buscarPorCodigo(Long codigo);

}
