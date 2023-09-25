import java.util.Scanner;

public class Password_checker {
    public static void main(String[] args) {
        String Username = "VOID";
        String Password = "VOIDGAMING";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            System.out.print("Enter Username: ");
            String username = sc.nextLine();
            System.out.println("Enter Password: ");
            String password = sc.nextLine();
            if (username.equals(Username) && password.equals(Password)) {
                System.out.println("Password successful!");
                break;
            } else {
                System.out.println("log in failed, you're locked out of the system.");
            }
        }
    }
}