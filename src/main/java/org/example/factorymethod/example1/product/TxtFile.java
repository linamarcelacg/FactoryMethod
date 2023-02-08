package org.example.factorymethod.example1.product;

import java.io.FileWriter;
import java.io.IOException;

public class TxtFile implements ITypeFile {

    final static String FILE_EXTENSION = ".txt";
    final static String MESSAGE = "Txt file was created";
    @Override
    public void writeFile(String name, String data) {
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(name + FILE_EXTENSION);
            myWriter.write(data);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(MESSAGE);

    }
}
