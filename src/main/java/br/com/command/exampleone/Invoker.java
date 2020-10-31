package br.com.command.exampleone;

import br.com.command.exampleone.eventos.Order;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Order> orderList = new ArrayList<>();

    public void fazerUmPedido(Order order) {
        orderList.add(order);
    }

    public void executarPedidos() {
        for (Order order : orderList) {
            order.executar();
        }
        orderList.clear();
    }
}

