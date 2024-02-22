package Lab;

public class Lab_1 {
    public static void main(String[] args) {
        double x = 2.0;
        double y = 1.0;

        double result = Math.abs(Math.sin(x - y)) + (2 * x) / Math.sqrt(1 + Math.abs(x * y));

        System.out.println("Результат: " + result);
    }
}
