package br.com.command.exampleone.eventos;

import br.com.command.exampleone.model.Produto;

public class Comprar implements Order {
    private Produto abcProduto;

    public Comprar(Produto abcProduto) {
        this.abcProduto = abcProduto;
    }
    @Override
    public void executar() {
        abcProduto.comprar();
    }
}

