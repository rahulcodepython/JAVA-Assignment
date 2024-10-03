import java.util.Scanner;

// Grader class
class Grader {
    private int score;

    public Grader(int score) {
        this.score = score;
    }

    public String letterGrade() {
        if (score >= 90 && score <= 100) {
            return "O";
        } else if (score >= 80) {
            return "E";
        } else if (score >= 70) {
            return "A";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public int getScore() {
        return score;
    }
}

// Sample class to test the Grader class
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading user input
        System.out.print("Enter a score between 0 and 100: ");
        int score = scanner.nextInt();

        // Validating the input
        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
        } else {
            // Creating a Grader object and obtaining the letter grade
            Grader grader = new Grader(score);
            System.out.println("The letter grade is: " + grader.letterGrade());
        }

        scanner.close();
    }
}
