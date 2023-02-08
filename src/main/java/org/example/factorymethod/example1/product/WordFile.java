package org.example.factorymethod.example1.product;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class WordFile implements ITypeFile {
    final static String FILE_EXTENSION = ".docx";
    final static String  MESSAGE = "createdWord";

    @Override
    public void writeFile(String name, String data) {
        XWPFDocument document = new XWPFDocument();
        try {
            FileOutputStream out = new FileOutputStream(name + FILE_EXTENSION);
            XWPFParagraph paragraph = document.createParagraph();
            XWPFRun run = paragraph.createRun();
            run.setText(data);
            document.write(out);
            out.close();
            System.out.println(MESSAGE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
