package core.basesyntax.utils;

import java.util.stream.Collectors;

import static core.basesyntax.db.ShopStorage.storage;

public class ReportGeneratorImpl implements ReportGenerator {
    @Override
    public String getReport() {
        return "fruit,quantity\n" + storage.entrySet().stream()
                .map(entry -> entry.getKey() + ',' + entry.getValue() + "\n")
                .collect(Collectors.joining());
    }
}
