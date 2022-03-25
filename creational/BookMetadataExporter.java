package creational;

import java.io.PrintStream;
import java.io.FileWriter;
import java.io.IOException;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see fit.
        BookMetadataFormatter formatter = createFormatter();
        for (Book book : books) {
            formatter.append(book);
        }
        stream.println(formatter.getMetadataString());
        try (FileWriter file = new FileWriter("./export.txt")) {
            file.write(formatter.getMetadataString());
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public abstract BookMetadataFormatter createFormatter()
}
