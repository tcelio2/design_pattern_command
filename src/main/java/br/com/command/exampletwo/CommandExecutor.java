package br.com.command.exampletwo;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {
    private final List<Operation> operationsList = new ArrayList<>();

    public String executeOperation(Operation operation) {
        operationsList.add(operation);
        return operation.execute();
    }

}
