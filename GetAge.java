import java.util.Scanner;

public class GetAge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter birth year: ");
        int birthYear = scanner.nextInt();

        int age = 2018 - birthYear;

        System.out.println("Age = " + age);
    }
}
