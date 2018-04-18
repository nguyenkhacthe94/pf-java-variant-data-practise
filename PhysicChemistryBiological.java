import java.util.Scanner;

public class PhysicChemistryBiological {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Physic mark: ");
        float physicMark = scanner.nextFloat();
        System.out.println("Enter Chemistry mark: ");
        float chemistryMark = scanner.nextFloat();
        System.out.println("Enter Biological mark: ");
        float biologicalMark = scanner.nextFloat();

        float totalMark = physicMark + chemistryMark + biologicalMark;
        float averageMark = totalMark / 3;

        System.out.println("Total mark = " + totalMark);
        System.out.println("Average mark = " + averageMark);
    }
}
