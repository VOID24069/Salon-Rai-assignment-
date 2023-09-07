import java.util.Random;
import java.util.Scanner;

public class three {
    //    Create a system that requires login to be accessed and gives user a range of program to choose from
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String name = "Salon";
        String password = "VOID";
        System.out.println("Enter  name");
        String username = user.next();
        System.out.println("Enter password");
        String userpassword = user.next();
        if (name.equals(name) && password.equals(userpassword)) {
            System.out.println("choose a program from the following");
            System.out.println("1. Calculator");
            System.out.println("2. Guessing game");
            System.out.println("3. SI calculator");
            System.out.println("4. check if entered char is vowel or constant");
            int num = user.nextInt();
            switch (num) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    double result = 0;
                    System.out.println("Enter a number: ");
                    double num1 = sc.nextDouble();
                    System.out.println("Enter a number");
                    double num2 = sc.nextDouble();
                    System.out.println("Enter a operator: ");
                    String operator = sc.next();
                    if (operator.equals("+")) {
                        result = num1 + num2;
                    } else if (operator.equals("-")) {
                        result = num1 - num2;
                    } else if (operator.equals("*")) {
                        result = num1 * num2;
                    } else if (operator.equals("/")) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Invalide");
                    }
                    System.out.println(result);

                    System.out.println("Running Program 1...");
                    break;

                case 2:
                    Scanner scanner = new Scanner(System.in);
                    Random random = new Random();
                    int targetNumber = random.nextInt(100) + 1;
                    while (true) {
                        System.out.print("Enter your guess (1-100): ");
                        int guess = scanner.nextInt();
                        if (guess == targetNumber) {
                            System.out.println("Congratulations! You guessed the number.");
                            break;
                        } else if (guess < targetNumber) {
                            System.out.println("Try a higher number.");
                        } else {
                            System.out.println("Try a lower number.");
                            System.out.println("Running Program 2...");
                        }
                    }
                    break;
                case 3:
                    System.out.println("SI calculator");
                    System.out.println("Enter Principle");
                    double Principle = user.nextInt();
                    System.out.println("Enter Time");
                    double Time = user.nextInt();
                    System.out.println("Enter Rate");
                    double Rate = user.nextInt();
                    double SI = (Principle + Time + Rate) / 100;
                    System.out.println("Simple interest is" + SI);

                    System.out.println("Running Program 3...");
                    break;
                case 4:
                    System.out.println("Vowel or Consonant");
                    System.out.println("Enter a letter:");
                    String Char = user.next();
                    if ((Char.equals("a") || (Char.equals("A"))) || (Char.equals("e") || (Char.equals("E"))) || (Char.equals("i") || (Char.equals("I"))) || (Char.equals("o") || (Char.equals("O"))) || (Char.equals("u") || (Char.equals("U")))) {
                        System.out.println("It is vowel");
                    } else {
                        System.out.println("It is consonant");
                        break;
                    }
            }
        }
    }
}