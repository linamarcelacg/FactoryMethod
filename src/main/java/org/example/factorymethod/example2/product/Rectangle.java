package org.example.factorymethod.example2.product;

public class Rectangle  implements Shape {

    @Override
    public int area(int width, int high) {
        return width * high;

    }
}
