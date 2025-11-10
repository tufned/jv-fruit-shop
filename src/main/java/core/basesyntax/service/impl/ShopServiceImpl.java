package core.basesyntax.service.impl;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.OperationStrategy;
import core.basesyntax.service.ShopService;

import java.util.List;
import static core.basesyntax.db.ShopStorage.storage;

public class ShopServiceImpl implements ShopService {
    OperationStrategy strategy;

    public ShopServiceImpl(OperationStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void process(List<FruitTransaction> transactions) {
        transactions
                .forEach(transaction -> {
                    strategy.get(transaction.getOperation()).handle(transaction, storage);
                });
    }
}
