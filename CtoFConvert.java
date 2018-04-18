import java.util.Scanner;

public class CtoFConvert {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Celcius temperature: ");
        float cTemp = scanner.nextFloat();

        double fTemp = cTemp * 1.8 + 32;
        System.out.println(cTemp + "*C = " + fTemp + "*F");
    }
}
