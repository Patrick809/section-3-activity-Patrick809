import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double num1;
        double num2;
        double result=0;
        int whichCalculaion;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose a task. Press 1 to add, 2 to subtract, 3 to multiply, and 4 to divied");

        whichCalculaion = input.nextInt();

        System.out.println("Please enter the first number.");
        num1 = input.nextDouble();

        System.out.println("Please enter the second number.");
        num2 = input.nextDouble();

        if (whichCalculaion == 1){
            result = num1 + num2;
        }
        if (whichCalculaion == 2){
            result = num1 - num2;
        }
        if (whichCalculaion == 3){
            result = num1 * num2;
        }
        if (whichCalculaion == 4){
            result = num1 / num2;
        }
        System.out.println("The answer is...");
        System.out.println(result);

    }
}
