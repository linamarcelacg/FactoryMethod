
package org.example.factorymethod.example1.creator.interfaceex;

import org.example.factorymethod.example1.product.ITypeFile;
import org.example.factorymethod.example1.product.WordFile;

public class WordFileCreator implements IFileCreator {
    @Override
    public ITypeFile createFile() {
        return new WordFile();
    }
}
