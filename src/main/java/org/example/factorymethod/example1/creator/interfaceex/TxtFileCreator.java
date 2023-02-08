package org.example.factorymethod.example1.creator.interfaceex;


import org.example.factorymethod.example1.product.TxtFile;
import org.example.factorymethod.example1.product.ITypeFile;

public class TxtFileCreator implements IFileCreator {

    public ITypeFile createFile() {
        return new TxtFile();
    }
}
