package org.example.factorymethod.example2.creator;

import org.example.factorymethod.example2.product.Circle;

import org.example.factorymethod.example2.product.Rectangle;
import org.example.factorymethod.example2.product.Shape;

//It can be abstract class, class, static methods and interface. Before Java 8--->Interface it's not possible because you need to return the new Object

public class ShapeCreator {

final static String MESSAGE = "Unknown shape ";
 public Shape create(String name){
  if (name == null || name.isEmpty())
      return null;
  switch (name) {
   case "Rectangle":
    return new Rectangle();
   case "Circle":
    return new Circle();
   default:
    throw new IllegalArgumentException( MESSAGE + name);
  }
 }
}
