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

    //Basic Calculator
    static void basicCalc() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--For summation insert 1\n--For multiplication insert 2\n--For subtraction insert 3\n--For division insert 4 ");
        System.out.print("Your choice is: ");
        int userInput = input.nextInt();

        while (userInput != 1 && userInput != 2 && userInput != 3 && userInput != 4) {
            System.out.println("\nYou must enter one of the following choices\n" +
                    "\n--For summation insert 1\n--For multiplication insert 2\n--For subtraction insert 3\n--For division insert 4 ");
            System.out.print("Your choice is: ");
            userInput = input.nextInt();

        }

        switch (userInput) {
            case 1:
                System.out.print("Please enter the first number: ");
                double num1 = input.nextDouble();
                System.out.print("Please enter the second number: ");
                double num2 = input.nextDouble();
                System.out.println("\n" + num1 + " + " + num2 + " = " + sumNum(num1, num2));
                break;
            case 2:
                System.out.print("Please enter the first number: ");
                double digit1 = input.nextDouble();
                System.out.print("Please enter the second number: ");
                double digit2 = input.nextDouble();
                System.out.println("\n" + digit1 + " * " + digit2 + " = " + multiNum(digit1, digit2));
                break;
            case 3:
                System.out.print("Please enter the first number: ");
                double firstNumber = input.nextDouble();
                System.out.print("Please enter the second number: ");
                double secoundNumber = input.nextDouble();
                System.out.println("\n" + firstNumber + " - " + secoundNumber + " = " + subNum(firstNumber, secoundNumber));
                break;
            case 4:

                System.out.print("Please enter the first number: ");
                double n1 = input.nextDouble();
                System.out.print("Please enter the second number: ");
                double n2 = input.nextDouble();

                while (n2 == 0) {
                    System.out.println("\nCannot divided by zero, please try again");
                    System.out.print("Please enter the second number again: ");
                    n2 = input.nextDouble();
                }

                System.out.println("\n" + n1 + " / " + n2 + " = " + divNum(n1, n2));
                break;
        }


    }

    //Basic Calculation Methods
    static double sumNum(double firstNumber, double secNumber) {
        return firstNumber + secNumber;
    }

    static double subNum(double firstNumber, double secNumber) {
        return firstNumber - secNumber;
    }

    static double multiNum(double firstNumber, double secNumber) {
        return firstNumber * secNumber;
    }

    static double divNum(double firstNumber, double secNumber) {
        return firstNumber / secNumber;
    }



    //Advanced Calculator
    static void advCalc() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n--Convert from Meter to CM --> 1\n--Convert from CM to Meter --> 2\n--Convert from Kilogram to gram --> 3\n--Convert from Gram to Kilogram --> 4 ");
        System.out.print("Your choice is: ");
        int userInput = input.nextInt();

        while (userInput < 1 || userInput > 4) {
            System.out.println("Incorrect input");
            System.out.println("You must enter one of the following choices\n" +
                    "\n--Convert from Meter to CM --> 1\n--Convert from CM to Meter --> 2\n--Convert from Kilogram to gram --> 3\n--Convert from Gram to Kilogram --> 4 ");
            System.out.print("Your choice is: ");
            userInput = input.nextInt();
        }

        switch (userInput) {
            case 1:
                System.out.print("Please enter the value: ");
                double value = input.nextDouble();
                System.out.println("\n" + value + " in Meter is: " + convertTometer(value)+"meter");
                break;

            case 2:
                System.out.print("Please enter the value: ");
                double amount = input.nextDouble();
                System.out.println("\n" + amount + " in CM is: " + convertTocm(amount)+"Cm");
                break;

            case 3:
                System.out.print("Please enter the value: ");
                double number = input.nextDouble();
                System.out.println("\n" + number + " in gram is: " + convertTogram(number)+"gram");
                break;

            case 4:
                System.out.print("Please enter the value: ");
                double digit = input.nextDouble();
                System.out.println("\n" + digit + " in Kg is: " + convertToKg(digit)+"Kg");
                break;


        }

    }

    //Advanced Calculation Methods
    static double convertTometer(double value) {
        return value * 100;
    }

    static double convertTocm(double value) {
        return value / 100;
    }

    static double convertTogram(double value) {
        return value * 1000;
    }

    static double convertToKg(double value) {
        return value / 1000;
    }


    //Financial Calculator
    static void finCalc(){
        Scanner input = new Scanner(System.in);

        System.out.println("\n--USD to EGP --> 1\n--EGP to USE --> 2\n--SAR to EGP --> 3\n--EGP to SAR --> 4 ");
        System.out.print("Your choice is: ");
        int userInput = input.nextInt();

        while (userInput < 1 || userInput > 4) {
            System.out.println("Incorrect input");
            System.out.println("You must enter one of the following choices\n\n--USD to EGP --> 1\n--EGP to USD --> 2\n--SAR to EGP --> 3\n--EGP to SAR --> 4 ");
            System.out.print("Your choice is: ");
            userInput = input.nextInt();
        }

        switch (userInput) {
            case 1:
                System.out.print("Please enter the amount: ");
                double value = input.nextDouble();
                System.out.println("\n" + value + " in EGP is: " + convertUsdToegp(value)+"EGP");
                break;

            case 2:
                System.out.print("Please enter the amount: ");
                double amount = input.nextDouble();
                System.out.println("\n" + amount + " in USD is: " + "$"+convertEgpTousd(amount));
                break;

            case 3:
                System.out.print("Please enter the amount: ");
                double number = input.nextDouble();
                System.out.println("\n" + number + " in EGP is: " + convertSarToegp(number)+"EGP");
                break;

            case 4:
                System.out.print("Please enter the amount: ");
                double digit = input.nextDouble();
                System.out.println("\n" + digit + " in SAR is: " + convertEgpTosar(digit)+"SAR");
                break;


        }

    }

    //Financial Calculation Methods
    static double convertUsdToegp(double value) {
        return value * 50;
    }

    static double convertEgpTousd(double value) {
        return value / 50;
    }

    static double convertSarToegp(double value) {
        return value * 13.21;
    }

    static double convertEgpTosar(double value) {
        return value / 13.21;
    }


}
