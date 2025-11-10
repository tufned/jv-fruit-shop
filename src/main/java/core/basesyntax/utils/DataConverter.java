package core.basesyntax.utils;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface DataConverter {
    List<FruitTransaction> convertToTransactions(List<String> reports);
}
