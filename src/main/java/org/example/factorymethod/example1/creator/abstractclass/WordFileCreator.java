package org.example.factorymethod.example1.creator.abstractclass;


import org.example.factorymethod.example1.product.WordFile;
import org.example.factorymethod.example1.product.ITypeFile;

public class WordFileCreator extends FileCreator {
    @Override
    public ITypeFile createFile() {
        return new WordFile();
    }
}
