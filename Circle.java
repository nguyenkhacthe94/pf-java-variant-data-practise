import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        float radius = scanner.nextFloat();

        double perimeter = radius * 2 * Math.PI;
        double area = radius * radius * Math.PI;

        System.out.println("Circle perimeter = " + perimeter);
        System.out.println("Circle area = " + area);
    }
}
