package org.example.factorymethod.example1.creator.interfaceex;


import org.example.factorymethod.example1.product.ITypeFile;

public interface IFileCreator {
    final static String FILE_NAME = "factoryMethodFile";
    final static String CONTENT = "hola";

    ITypeFile createFile();

    default void execute() {
        ITypeFile typeFile = createFile();
        typeFile.writeFile(FILE_NAME, CONTENT);
    }

}
