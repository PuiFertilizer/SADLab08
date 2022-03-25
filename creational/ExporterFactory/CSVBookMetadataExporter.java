package creational.ExporterFactory;
import creational.BookMetadataExporter;
import creational.BookMetadataFormatter;
import creational.CSVBookMetadataFormatter;
import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {
    @Override
    public BookMetadataFormatter createFormatter() throws IOException {
        return new CSVBookMetadataFormatter();
    }
}