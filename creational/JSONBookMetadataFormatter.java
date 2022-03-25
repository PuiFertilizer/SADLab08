package creational;

import java.io.IOException;
import java.io.StringWriter;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {
    private StringWriter writer;
    private JSONArray json;

    public JSONBookMetadataFormatter(){
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        writer = new StringWriter();
        json = new JSONArray();
        FileWriter fileWriter = new FileWriter("./BooksData.json");
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return null;
    }
}
