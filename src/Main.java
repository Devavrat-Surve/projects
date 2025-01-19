import java.util.Scanner;

class Calsi {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("Enter second number");
        number2 = input.nextDouble();


        System.out.println("Choose an operator: + , % , - , ^ (square), *, or /");
        operator = input.next().charAt(0);




        switch (operator) {
            
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            case '^':
                result = number1 * number1 ;
                System.out.println("square of " + number1 +" is " +result);
                break;

            case '%':
                result = (number1 / number2) * 100 ;
                System.out.println("Percentage = " +number1 +" is " +result  +" % of " +number2);
                break;

            default:
                System.out.println("Invalid operator!");
                break;


        }
        System.out.println("Code by - Devavrat Surve");
        input.close();
    }
}
