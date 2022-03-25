package creational.ExporterFactory;
import creational.BookMetadataExporter;
import creational.BookMetadataFormatter;
import creational.XMLBookMetadataFormatter;
import java.io.IOException;

public class XMLBookMetadataExporter extends BookMetadataExporter {
    @Override
    public BookMetadataFormatter createFormatter() throws IOException {
        return new XMLBookMetadataFormatter();
    }
}