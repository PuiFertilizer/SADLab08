package creational;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Arrays;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
        try(FileWriter fileWriter = new FileWriter("./BooksData.json")){
            fileWriter.write("");
        }catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        try(FileWriter fileWriter = new FileWriter("./BooksData.json")){
            JSONObject jsonOb = new JSONObject();
            jsonOb.put("ISBN", b.getISBN());
            jsonOb.put("title", b.getTitle());
            jsonOb.put("publisher", b.getPublisher());
            jsonOb.put("authors", Arrays.toString(b.getAuthors()));
            json.add(jsonOb);

            fileWriter.write(json.toJSONString());
            writer.write(json.toJSONString());
        }catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return writer.toString();
    }
}
