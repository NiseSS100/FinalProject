package store;

import java.io.IOException;

public class Ganre {
    String name ;
    int numOfBooks;

    public void getGanreData() throws IOException {
        name = FileReader.readLine();
       // numOfBooks = FileReader.readLine();
    }
}
