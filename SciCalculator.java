import java.util.Scanner;

public class SciCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double Operand1;
        double Operand2;
        int Operation;
        double RESULT = 0.0;
        int Calculations = 0;
        double Average;
        double Total = 0.0;



        System.out.println("Current Result: " + RESULT);
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
        System.out.println("Enter Menu Selection: ");
        Operation = scnr.nextInt();


        while (Calculations >= 0 ) {
            if (Operation == 0) {
                System.out.println("Thanks for using this calculator. Goodbye!");
                break;
            }
            else if(Operation == 1){
                System.out.println("Enter first operand: ");
                Operand1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                Operand2 = scnr.nextDouble();
                RESULT = Operand1 + Operand2;
                Total = Total + RESULT;
                Calculations = Calculations + 1;
                System.out.println("Current Result: " + RESULT);
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("Enter Menu Selection: ");
                Operation = scnr.nextInt();
            }
            else if(Operation == 2){
                System.out.println("Enter first operand: ");
                Operand1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                Operand2 = scnr.nextDouble();
                RESULT = Operand1 - Operand2;
                Total = Total + RESULT;
                Calculations = Calculations + 1;
                System.out.println("Current Result: " + RESULT);
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("Enter Menu Selection: ");
                Operation = scnr.nextInt();
            }
            else if(Operation == 3){
                System.out.println("Enter first operand: ");
                Operand1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                Operand2 = scnr.nextDouble();
                RESULT = Operand1 * Operand2;
                Total = Total + RESULT;
                Calculations = Calculations + 1;
                System.out.println("Current Result: " + RESULT);
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("Enter Menu Selection: ");
                Operation = scnr.nextInt();
            }
            else if(Operation == 4){
                System.out.println("Enter first operand: ");
                Operand1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                Operand2 = scnr.nextDouble();
                RESULT = Operand1 / Operand2;
                Total = Total + RESULT;
                Calculations = Calculations + 1;
                System.out.println("Current Result: " + RESULT);
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("Enter Menu Selection: ");
                Operation = scnr.nextInt();
            }
            else if(Operation == 5){
                System.out.println("Enter first operand: ");
                Operand1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                Operand2 = scnr.nextDouble();
                RESULT = Math.pow(Operand1 ,  Operand2);
                Total = Total + RESULT;
                Calculations = Calculations + 1;
                System.out.println("Current Result: " + RESULT);
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("Enter Menu Selection: ");
                Operation = scnr.nextInt();
            }
            else if(Operation == 6){
                System.out.println("Enter first operand: ");
                Operand1 = scnr.nextDouble();
                System.out.println("Enter second operand: ");
                Operand2 = scnr.nextDouble();
                RESULT = Math.log(Operand2) / Math.log(Operand1);
                Total = Total + RESULT;
                Calculations = Calculations + 1;
                System.out.println("Current Result: " + RESULT);
                System.out.println("Calculator Menu");
                System.out.println("---------------");
                System.out.println("0. Exit Program");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exponentiation");
                System.out.println("6. Logarithm");
                System.out.println("7. Display Average");
                System.out.println("Enter Menu Selection: ");
                Operation = scnr.nextInt();
            }
            else if(Operation == 7){
                if(Calculations > 0) {
                    System.out.println("Sum of calculations: " + Total);
                    System.out.println("Number of calculations: " + Calculations);
                    Average = Total / Calculations;
                    System.out.print("Average of calculations: ");
                    System.out.printf("%.2f", Average);
                    System.out.println("Enter Menu Selection: ");
                    Operation = scnr.nextInt();

                }
                else {
                    System.out.println("Error: No calculations yet to average!");
                    System.out.println("Enter Menu Selection: ");
                    Operation = scnr.nextInt();

                }




            }
            else{
                System.out.println("Error: Invalid selection!");
                System.out.println("Enter Menu Selection: ");
                Operation = scnr.nextInt();
            }

        }
    }
    }