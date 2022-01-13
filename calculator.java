import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    char operator;
    int number3, number2, answer;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -");
    operator = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    number3 = input.nextInt();

    System.out.println("Enter second number");
    number2 = input.nextInt();

    switch (operator) {

      // performs addition between numbers
      case '+':
        answer = number3 + number2;
        System.out.println(number3 + " + " + number2 + " = " + answer);
        break;

      // performs subtraction between numbers
      case '-':
        answer = number3 - number2;
        System.out.println(number3 + " - " + number2 + " = " + answer);
        break;

    

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}