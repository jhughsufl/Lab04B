// Lab Partner Caden Kuchera

import java.util.Scanner;

public class SciCalculator {
    //Scientific Calculator using loops and switch statements
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        //Declare and Initialize variables
        double operandOne, operandTwo, operandResult = 0, totalResult = 0, resultAverage;
        int operation;
        int numOfOperations = 0;

        //Menu Loop
        boolean menuLoop = true;
        while (menuLoop) {

        //Prints Operation Menu
        System.out.println("Current Result: " + operandResult);
        System.out.println("\n");
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average \n");

        //Calculator Loop
        boolean calcLoop = true;
        while (calcLoop) {

            System.out.println("Enter Menu Selection: ");
            operation = myScanner.nextInt();

            switch (operation) {
                case 0:
                    //Exit option
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    System.exit(1);
                    break;
                case 1:
                    //Addition
                    System.out.println("Enter first operand: ");
                    operandOne = myScanner.nextDouble();
                    System.out.println("Enter second operand: ");
                    operandTwo = myScanner.nextDouble();
                    operandResult = operandOne + operandTwo;
                    numOfOperations++;
                    totalResult += operandResult;
                    calcLoop = false;
                    break;
                case 2:
                    //Subtraction
                    System.out.println("Enter first operand: ");
                    operandOne = myScanner.nextDouble();
                    System.out.println("Enter second operand: ");
                    operandTwo = myScanner.nextDouble();
                    operandResult = operandOne - operandTwo;
                    numOfOperations++;
                    totalResult += operandResult;
                    calcLoop = false;
                    break;
                case 3:
                    //Multiplication
                    System.out.println("Enter first operand: ");
                    operandOne = myScanner.nextDouble();
                    System.out.println("Enter second operand: ");
                    operandTwo = myScanner.nextDouble();
                    operandResult = operandOne * operandTwo;
                    numOfOperations++;
                    totalResult += operandResult;
                    calcLoop = false;
                    break;
                case 4:
                    //Division
                    System.out.println("Enter first operand: ");
                    operandOne = myScanner.nextDouble();
                    System.out.println("Enter second operand: ");
                    operandTwo = myScanner.nextDouble();
                    operandResult = operandOne / operandTwo;
                    numOfOperations++;
                    calcLoop = false;
                    break;
                case 5:
                    //Exponentiation
                    System.out.println("Enter first operand: ");
                    operandOne = myScanner.nextDouble();
                    System.out.println("Enter second operand: ");
                    operandTwo = myScanner.nextDouble();
                    operandResult = Math.pow(operandOne, operandTwo);
                    totalResult += operandResult;
                    numOfOperations++;
                    calcLoop = false;
                    break;
                case 6:
                    //Logarithm
                    System.out.println("Enter first operand: ");
                    operandOne = myScanner.nextDouble();
                    System.out.println("Enter second operand: ");
                    operandTwo = myScanner.nextDouble();
                    operandResult = (Math.log(operandTwo)) / (Math.log(operandOne));
                    totalResult += operandResult;
                    numOfOperations++;
                    calcLoop = false;
                    break;
                case 7:
                    //Result Average
                    switch (numOfOperations) {
                        case 0:
                            //Prints error if no results
                            System.out.println("Error: No calculations yet to average!");
                            break;
                        default:
                            //Prints average
                            System.out.println("Sum of calculations: " + totalResult);
                            System.out.println("Number of calculations: " + numOfOperations);
                            resultAverage = totalResult / numOfOperations;
                            resultAverage *= 100;
                            resultAverage = Math.round(resultAverage);
                            resultAverage /= 100;
                            System.out.println("Average of calculations: " + resultAverage);
                            break;
                    }
                    break;
                default:
                    //Prints error if user did not select 0-7 in menu
                    System.out.println("Error: Invalid selection!");
                    break;


            }
        }
        }
    }
}
