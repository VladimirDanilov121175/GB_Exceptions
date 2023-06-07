package Lesson02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExceptionSample {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("test.txt");
            reader.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("Caught exception " + e.getClass().getSimpleName());
        } finally {
            System.out.println("finally started");
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("finally finished");
        }
    }
}
