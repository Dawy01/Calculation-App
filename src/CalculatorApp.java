import java.util.Scanner;
public class CalculatorApp {

    public static void main(String[] args) {
        final int BASIC = 1;
        final int ADVANCED = 2;
        final int FINANCIAL = 3;

        Scanner input = new Scanner(System.in);
        System.out.println("\n\n*****Welcome to the calculator App!*****");
        System.out.println("Select one of the following calculation types: ");
        System.out.println("\n1-Basic Calculations\n2-Advanced Calculations\n3-Financial Calculations\n");
        System.out.print("Your choice is: ");
        int choice = input.nextInt();

        while (choice != BASIC && choice != ADVANCED && choice != FINANCIAL) {
            System.out.println("\nYou must enter one of the following choices\n\n1-Basic Calculations\n2-Advanced Calculations\n3-Financial Calculations\n");
            System.out.print("Your choice is: ");
            choice = input.nextInt();
        }

        switch (choice) {
            case 1:
                basicCalc();
                break;
            case 2:
                advCalc();
                break;
            case 3:
                finCalc();
                break;

        }

    }
}
