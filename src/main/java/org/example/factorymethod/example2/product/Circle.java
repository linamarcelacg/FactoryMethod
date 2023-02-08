package org.example.factorymethod.example2.product;


public class Circle implements Shape {
     static final double PI = 3.1416;

    @Override
    public int area(int width, int high) {

        return (int) (width * high * PI);

    }
}
