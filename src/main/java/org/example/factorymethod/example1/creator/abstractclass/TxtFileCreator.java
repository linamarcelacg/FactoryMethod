package org.example.factorymethod.example1.creator.abstractclass;


import org.example.factorymethod.example1.product.TxtFile;
import org.example.factorymethod.example1.product.ITypeFile;

public class TxtFileCreator extends FileCreator {
    @Override
    public ITypeFile createFile() {
        return new TxtFile();
    }
}
