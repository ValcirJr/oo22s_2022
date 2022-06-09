package br.edu.utfpr.CRUDservice;

import br.edu.utfpr.config.BancoDeDados;
import br.edu.utfpr.entity.Pizza;

import java.time.LocalDate;

public class PizzaService implements CrudService<Pizza> {

    @Override
    public void salvar(Pizza object) {
        object.setUltimaModificacao(LocalDate.now());
        BancoDeDados.pizzas.add(object);
    }

    @Override
    public void remover(Long codigo) {
        Pizza p = buscarPorCodigo(codigo);
        if(p != null) BancoDeDados.pizzas.remove(p);
    }

    @Override
    public Pizza buscarPorCodigo(Long codigo) {
        return BancoDeDados.pizzas.stream()
                .filter(pizza -> pizza.getId() == codigo)
                .findFirst()
                .orElse(null);
    }
}
