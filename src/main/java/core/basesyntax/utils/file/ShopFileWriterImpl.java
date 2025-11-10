package core.basesyntax.utils.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ShopFileWriterImpl implements ShopFileWriter {
    @Override
    public void write(String data, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
