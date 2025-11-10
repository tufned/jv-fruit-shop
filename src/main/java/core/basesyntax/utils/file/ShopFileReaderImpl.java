package core.basesyntax.utils.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class ShopFileReaderImpl implements ShopFileReader {
    public List<String> readCsv(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines().skip(1).toList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
