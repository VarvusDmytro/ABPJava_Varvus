package Lab;
import java.util.Scanner;

class Rectangle {
    private static float xSide;
    private static float ySide;

    static void getPerimeter() {
        float perimeter = (2 * xSide) + (2 * ySide);
        System.out.println("Периметр: "+perimeter);
    }

    static void getArea() {
        float area = (xSide * ySide);
        System.out.println("Площа"+area);
    }

    static void getDiagonal() {
        float diagonal = (float) Math.sqrt((Math.pow(xSide,2)) + (Math.pow(ySide,2)));
        System.out.println("Діагональ: " + diagonal);
    }

    public Rectangle(float x, float y) {
        xSide = x;
        ySide = y;
    }

    public Rectangle() {
        xSide = 6;
        ySide = 9;
    }
}

public class Lab_2 {

    public static void main(String[] args) {
        System.out.println("Введіть сторони прямокутника:");
        Scanner obviouslyScanner = new Scanner(System.in);
        float x = 0;
        float y = 0;
        try {
            x = obviouslyScanner.nextFloat();
            y = obviouslyScanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Something went wrong. Please enter a number.");
        }
        Rectangle thisIsARectangle = new Rectangle(x,y);
        Rectangle.getPerimeter();
        Rectangle.getArea();
        Rectangle.getDiagonal();
    }
}
