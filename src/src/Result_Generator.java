import java.util.Scanner;
public class Result_Generator {
    public static void main(String[] args) {
        Scanner student = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int subjects = student.nextInt();

        if (subjects < 0 && subjects >= 8) {
            System.out.println("Number of subjects must be greater than 0 and less than 9");
        }
        double totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for Subject " + i + ": ");
            double marks = student.nextDouble();

            if (marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100.");
            }

            totalMarks += marks;
        }

        double percentage = (totalMarks / (subjects * 100)) * 100;

        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80 && percentage <= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 70 && percentage <= 80) {
            System.out.println("Grade: B+");
        } else if (percentage >= 60 && percentage <= 70) {
            System.out.println("Grade: B");
        } else if (percentage >=50 && percentage <=60) {
            System.out.println("Grade: C+");
        } else if (percentage >=40 && percentage <=50) {
            System.out.println("Grade: C");
        }else if (percentage >=35 && percentage <=40) {
            System.out.println("Grade: D");
        }else if (percentage <35) {
            System.out.println("Non Graded");
        }else{
            System.out.println("Fail");
        }

    }
}