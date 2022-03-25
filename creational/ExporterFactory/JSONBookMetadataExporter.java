package creational.ExporterFactory;
import creational.BookMetadataExporter;
import creational.BookMetadataFormatter;
import creational.JSONBookMetadataFormatter;
import java.io.IOException;

public class JSONBookMetadataExporter extends BookMetadataExporter {
    @Override
    public BookMetadataFormatter createFormatter() throws IOException {
        return new JSONBookMetadataFormatter();
    }
}