import java.util.Scanner;

// Class to handle range validation
class RangeValidator {
    private int start;
    private int end;

    public RangeValidator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean isValidRange() {
        return start >= 2 && start <= end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}

// Class to check for prime numbers
class PrimeChecker {
    public boolean isPrime(int number) {
        if (number <= 1)
            return false;
        if (number == 2)
            return true;
        if (number % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}

// Class to calculate sum and count of prime numbers
class PrimeCalculator {
    private int start;
    private int end;
    private PrimeChecker primeChecker;

    public PrimeCalculator(int start, int end) {
        this.start = start;
        this.end = end;
        this.primeChecker = new PrimeChecker();
    }

    public void calculatePrimeSumAndCount() {
        int sum = 0;
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (primeChecker.isPrime(i)) {
                sum += i;
                count++;
            }
        }

        System.out.println("Total number of prime numbers: " + count);
        System.out.println("Sum of all prime numbers: " + sum);
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the range
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        // Validate the range
        RangeValidator rangeValidator = new RangeValidator(start, end);
        if (!rangeValidator.isValidRange()) {
            System.out.println("Invalid range! Start should be >= 2 and start should be <= end.");
            scanner.close();
            return;
        }

        // Calculate the sum and count of prime numbers
        PrimeCalculator primeCalculator = new PrimeCalculator(rangeValidator.getStart(), rangeValidator.getEnd());
        primeCalculator.calculatePrimeSumAndCount();

        scanner.close();
    }
}
