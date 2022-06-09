package br.edu.utfpr;

import br.edu.utfpr.CRUDservice.PedidoService;
import br.edu.utfpr.config.BancoDeDados;
import br.edu.utfpr.entity.Pedido;
import br.edu.utfpr.entity.Pizza;

import java.math.BigDecimal;
import java.util.List;

public class MontarPedidoService {

    PedidoService pedidoService = new PedidoService();

    public Pedido montarPedido(List<Pizza> pizzas){
        Pedido pedido = new Pedido(pizzas);
        BigDecimal valorTotal = pizzas.stream()
                .map(pizza -> pizza.getTamanho().getValor())
                .reduce(BigDecimal.ZERO, (a, b) -> {
                   return a.add(b);
                });
        pedido.setValorTotal(valorTotal);
        pedido.setId(Long.valueOf(BancoDeDados.pedidos.size()));
        pedidoService.salvar(pedido);
        return pedido;
    }
}
