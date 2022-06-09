package br.edu.utfpr.entity;

import br.edu.utfpr.entity.Entity;
import br.edu.utfpr.entity.Pizza;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Pedido extends Entity {

    private List<Pizza> pizza;
    private BigDecimal valorTotal;

    public Pedido(List<Pizza> pizza) {
        this.pizza = pizza;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
}
