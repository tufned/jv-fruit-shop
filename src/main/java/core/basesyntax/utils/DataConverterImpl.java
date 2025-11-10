package core.basesyntax.utils;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public class DataConverterImpl implements DataConverter {
    @Override
    public List<FruitTransaction> convertToTransactions(List<String> reports) {
        return reports.stream()
                .map(str -> {
                    String[] parts = str.split(",");
                    FruitTransaction.Operation op = FruitTransaction.Operation.valueOf(parts[0]);
                    String fruit = parts[1];
                    int quantity = Integer.parseInt(parts[2]);
                    return FruitTransaction.of(op, fruit, quantity);
                })
                .toList();
    }
}
