package br.edu.utfpr;

import br.edu.utfpr.config.BancoDeDados;
import br.edu.utfpr.entity.Entity;
import br.edu.utfpr.entity.Pizza;
import br.edu.utfpr.enums.Tamanho;

import java.util.List;

import static br.edu.utfpr.enums.Tamanho.*;

public class Main {
    public static void main(String[] args) {
        MontarPedidoService montarPedidoService = new MontarPedidoService();

        List<Pizza> pizzas = List.of(
                new Pizza(1L, PEQUENO),
                new Pizza(2L, GRANDE),
                new Pizza(3L, MEDIO),
                new Pizza(4L, FAMILIA)
        );

        System.out.println(
            montarPedidoService.montarPedido(pizzas).getValorTotal()
        );
    }
}
