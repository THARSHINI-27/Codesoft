package codsoft;
import java.util.Scanner;
public class task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfSubjects;
        System.out.print("Number of subjects: ");

        numberOfSubjects = scanner.nextInt();

        int[] marks = new int[numberOfSubjects];

        int totalMarks = 0;

        for (int i = 0; i < numberOfSubjects; i++) {

            System.out.print("Marks gained in subject " + (i + 1) + ": ");

            marks[i] = scanner.nextInt();

            totalMarks += marks[i];

        }
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        char grade;
        if (averagePercentage >= 90) {

            grade = 'A';

        } else if (averagePercentage >= 80) {

            grade = 'B';

        } else if (averagePercentage >= 70) {

            grade = 'C';

        } else if (averagePercentage >= 60) {

            grade = 'D';

        } else if (averagePercentage >= 50) {

            grade = 'E';

        } else {

            grade = 'F';

        }
        System.out.println("Total Marks: " + totalMarks);

        System.out.println("Average Percentage: " + averagePercentage);

        System.out.println("Grade: " + grade);
        scanner.close();

    }

}

