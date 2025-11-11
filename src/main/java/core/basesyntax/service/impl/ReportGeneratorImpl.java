package core.basesyntax.service.impl;

import core.basesyntax.db.ShopStorage;
import core.basesyntax.service.ReportGenerator;
import java.util.stream.Collectors;

public class ReportGeneratorImpl implements ReportGenerator {
    private final ShopStorage storage;

    public ReportGeneratorImpl(ShopStorage storage) {
        this.storage = storage;
    }

    @Override
    public String getReport() {
        return "fruit,quantity" + System.lineSeparator() + storage.getStorage().entrySet().stream()
                .map(entry -> entry.getKey() + ',' + entry.getValue() + System.lineSeparator())
                .collect(Collectors.joining());
    }
}
