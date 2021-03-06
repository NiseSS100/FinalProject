package store;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public CSVReader(FileReader fileReader) {
    }

    public static void main(String[] args) {

        String csvFile = "src/store/Products.txt";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] country = line.split(cvsSplitBy);

                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readAll() {
    }

    public void close() {
    }
}