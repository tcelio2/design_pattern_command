package br.com.command;

import br.com.command.exampleone.Invoker;
import br.com.command.exampleone.eventos.Comprar;
import br.com.command.exampleone.eventos.Vender;
import br.com.command.exampleone.model.Produto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandApplication.class, args);
        //1°Exemplo:
        Produto produto = new Produto();

        Comprar comprar = new Comprar(produto);
        Vender vender = new Vender(produto);

        Invoker invoker = new Invoker();
        invoker.fazerUmPedido(comprar);
        invoker.fazerUmPedido(vender);

        invoker.executarPedidos();

        //2°Exemplo:
//        CommandExecutor command = new CommandExecutor();
//        command.executeOperation(new Open(new TextFile("text1.txt")));
//        command.executeOperation(new Save(new TextFile("text1.txt")));




    }
}
