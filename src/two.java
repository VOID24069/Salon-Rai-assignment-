import java.util.Random;
import java.util.Scanner;

public class two {
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
                    Scanner cal = new Scanner(System.in);
                    System.out.println("Enter the operator (*, +, -, /):");
                    String operator = cal.next();

                    System.out.println("Enter the first number");
                    double num1 = cal.nextDouble();

                    System.out.println("Enter the second number");
                    double num2 = cal.nextDouble();
                    double result;

                    switch (operator) {
                        case "+":
                            System.out.println("The sum is:" + (num1 + num2));
                            break;
                        case "-":
                            System.out.println("The difference is:" + (num1 - num2));
                            break;
                        case "*":
                            System.out.println("The result is:" + (num1 * num2));
                            break;
                        case "/":
                            System.out.println("The division is:" + (num1 / num2));
                            break;
                        default:
                            System.out.println("Operator Not Found");
                    }
                    System.out.println("Running Program 1...");
                    break;
                case 2:
                    System.out.println("Guessing Game");
                    int random = (int) Math.random()+100;
                    System.out.println("Enter your number:");
                    int inputnum = user.nextInt();
                    if (inputnum==random){
                        System.out.println("Congratulations");
                    }else{
                        System.out.println("you lose");
                    }System.out.println("The random number was: "+ random);
                            System.out.println("Running Program 2...");
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