package br.edu.utfpr.CRUDservice;

import br.edu.utfpr.config.BancoDeDados;
import br.edu.utfpr.entity.Pedido;

import java.time.LocalDate;

public class PedidoService implements CrudService<Pedido> {
    @Override
    public void salvar(Pedido object) {
        object.setUltimaModificacao(LocalDate.now());
        BancoDeDados.pedidos.add(object);
    }

    @Override
    public void remover(Long codigo) {
        Pedido p = buscarPorCodigo(codigo);
        if(p != null) BancoDeDados.pedidos.remove(p);
    }

    @Override
    public Pedido buscarPorCodigo(Long codigo) {
        return BancoDeDados.pedidos.stream()
                .filter(pedido -> pedido.getId() == codigo)
                .findFirst()
                .orElse(null);
    }
}
