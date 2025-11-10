package core.basesyntax.strategy.impl;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.OperationHandler;
import java.util.Map;

public class ReturnOperation implements OperationHandler {
    @Override
    public void handle(FruitTransaction transaction, Map<String, Integer> storage) {
        int newQuantity = storage.get(transaction.getFruit()) + transaction.getQuantity();
        storage.put(transaction.getFruit(), newQuantity);
    }
}
