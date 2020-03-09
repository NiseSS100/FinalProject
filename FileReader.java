package store;

import java.awt.print.Book;
import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

// Четене и писане във файл
public class FileReader extends Reader {

    private static final String PERSON_FILE_EXTENSION = ".file";
    private static final String PERSON_FILE_NAME = "books";
    private static final String FILE_PATH = "src/store/";
    private static final String FULL_PATH = FILE_PATH + PERSON_FILE_NAME + PERSON_FILE_EXTENSION;

    private static ArrayList<Book> booksList = new ArrayList<>();

    public FileReader(File file) {
    }

    public FileReader() {

    }

    public static void createBooksFile() {
        File file = new File(FULL_PATH);
        file.getParentFile().mkdirs();

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.err.println("Файлът не може да бъде създаден!");
            e.printStackTrace();
        }
    }

    public static boolean isFileExists() {
        File file = new File(FULL_PATH);
        return file.exists();
    }

    @SuppressWarnings("resource")
    public static Book[] readBooks() {
        try {
            File file = new File(FULL_PATH);
           // FileInputStream fileStream = new FileInputStream(FULL_PATH);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String stringLine;

            while((stringLine = bufferedReader.readLine()) != null) {
                String[] data = stringLine.split("\t");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Book[] books = new Book[booksList.size()];
        return booksList.toArray(books);
    }



    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }

    public static String readLine() throws IOException {
        File file = new File(FULL_PATH);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String output = bufferedReader.readLine();
        return output;
    }

    public static void readInt() throws IOException {
        BufferedReader instr = new BufferedReader( new FileReader(new File(FULL_PATH)));
        String[] b = new String[10];
        Pattern pattern = Pattern.compile("[\\s]+");
        b = instr.readLine().split(pattern.pattern());
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < b.length; i++) {
                int value = Integer.parseInt(b[i]);
              //  return value;
            }
        }
    }
}

