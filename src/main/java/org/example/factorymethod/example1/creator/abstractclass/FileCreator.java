package org.example.factorymethod.example1.creator.abstractclass;


import org.example.factorymethod.example1.product.ITypeFile;

public abstract class FileCreator {

    final static String FILE_NAME = "factoryMethodFile";
    final static String CONTENT = "hola";

    abstract ITypeFile createFile();

    public void execute() {
        ITypeFile typeFile = createFile();
        typeFile.writeFile(FILE_NAME, CONTENT);
    }

}
