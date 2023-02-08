package org.example;

import org.example.factorymethod.example1.creator.abstractclass.FileCreator;
import org.example.factorymethod.example1.creator.abstractclass.TxtFileCreator;
import org.example.factorymethod.example1.creator.interfaceex.IFileCreator;
import org.example.factorymethod.example2.creator.ShapeCreator;
import org.example.factorymethod.example2.creator.ShapeCreatorStatic;
import org.example.factorymethod.example2.product.Shape;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    final static String TITLE = "FACTORY METHOD!";
    final static String OPTION_1 = "1. txt";
    final static String OPTION_2 = "2. Excel";
    final static String OPTION_3 = "3. Rectangle";
    final static String OPTION_4 = "4. Circle";
    final static String OPTION_5 = "5. Exit";
    final static String MESSAGE = "Choose the option: ";
    final static String RECTANGLE = "Rectangle";
    final static String CIRCLE = "Circle";
    final static String RECTANGLE_MESSAGE = "The rectangle area is: ";
    final static String CIRCLE_MESSAGE = "The circle area is: ";
    final static String EXIT = "Exit";
    final static String ERROR = "Error";


    public static void main( String[] args )
    {
        System.out.println(TITLE);
        String option = null;
       FileCreator file;
        IFileCreator file2;
        Shape shape;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println(OPTION_1);
            System.out.println(OPTION_2);
            System.out.println(OPTION_3);
            System.out.println(OPTION_4);
            System.out.println(OPTION_5);
            System.out.println(MESSAGE);

            option = in.next();

            switch (option) {
                case "1": {
                    file = new TxtFileCreator();
                    file.execute();
                    break;
                }
                case "2": {
                    file2 = new org.example.factorymethod.example1.creator.interfaceex.WordFileCreator();
                    file2.execute();
                    break;
                }
                case "3": {
                    shape = new ShapeCreator().create(RECTANGLE);
                    System.out.println(RECTANGLE_MESSAGE + shape.area(5, 3));
                    break;
                }
                case "4": {
                    shape = ShapeCreatorStatic.create(CIRCLE);
                    System.out.println(CIRCLE_MESSAGE + shape.area(5, 5));
                    break;
                }
                case "5": {

                    System.out.println(EXIT);
                    break;
                }
                default:
                    System.out.println(ERROR);
            }
            System.out.println("");

        }while(!option.equals("5"));

    }
}
