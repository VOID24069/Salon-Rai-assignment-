import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        String name = "Salon rai";
        String password = "VOID";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a username:");
        String Inputname = sc.next();
        System.out.println("Enter a password:");
        String Inputpassword = sc.next();
        if (name.equals(Inputname)){
            if( password.equals(Inputpassword) ){
                System.out.println("Welcome");
                System.out.println("Choose the following:");
                System.out.println("1. Calculator");
                System.out.println("2. Guessing");
                System.out.println("3. SI Calculator");
                System.out.println("4. Vowel or Constant");
                System.out.println("Choose program");
                int num1 = sc.nextInt();
                if (num1>=1&& num1<=4) {
                    if (num1 == 1) {
                        System.out.println("Calculator");
                        System.out.println("Enter first number:");
                        double value1 = sc.nextDouble();
                        System.out.println("Enter second number:");
                        double value2 = sc.nextDouble();
                        System.out.println("Enter operators(+,-,*,/):");
                        String operator = sc.next();
                        double result = 0;
                        switch (operator) {
                            case "+":
                                result = value1 + value2;
                                break;
                            case "-":
                                result = value1 - value2;
                                break;
                            case "*":
                                result = value1 * value2;
                                break;
                            case "/":
                                result = value1 / value2;
                                break;
                            default:
                                System.out.println("Invalid");
                        }
                        System.out.println(result);
                    } else if (num1==2) {
                        System.out.println("Guessing Game");
                        int random = (int) Math.random()+100;
                        System.out.println("Enter your number:");
                        int inputnum = sc.nextInt();
                        if (inputnum==random){
                            System.out.println("Congratulations");
                        }else{
                            System.out.println("you lose");
                        }System.out.println("The random number was: "+ random);
                    } else if (num1 == 3) {
                        System.out.println("SI Calculator");
                        System.out.println("Enter principle:");
                        int P = sc.nextInt();
                        System.out.println("Enter Rate:");
                        double R = sc.nextDouble();
                        System.out.println("Enter Time:");
                        double T = sc.nextDouble();
                        double SI = (P * T * R) / 100;
                        System.out.println("The SI is :" + SI);
                    }else if ( num1==4 ) {
                        System.out.println("Vowel or Consonant");
                        System.out.println("Enter a letter:");
                        String Char = sc.next();
                        if ((Char.equals("a") || (Char.equals("A")))||(Char.equals("e") || (Char.equals("E")))||(Char.equals("i") || (Char.equals("I")))||(Char.equals("o") || (Char.equals("O")))||(Char.equals("u") || (Char.equals("U")))) {
                            System.out.println("It is vowel");
                        } else {
                            System.out.println("It is consonant");
                        }
                    }
                }else {
                    System.out.println("Choose a number between 1 to 4 only");
                }}else{
                System.out.println("Invalid Password");
            }
        }else {
            System.out.println("Invalid user name");
        }
    }
}