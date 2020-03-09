package store;

import java.io.IOException;

public class Book {
    String name;
    String price;
    String image;

    public void getBookData() throws IOException {
        name = FileReader.readLine();
        price = FileReader.readLine();
        image = FileReader.readLine();

    }
}
