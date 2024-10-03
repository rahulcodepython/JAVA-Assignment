// Custom exception class NoMatchFoundException
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

// Class to test the custom exception
public class Main {
    public static void main(String[] args) {
        String inputString = "College"; // Change this to test different cases

        try {
            checkString(inputString);
            System.out.println("The string matches 'University'.");
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to check if the string matches "University"
    public static void checkString(String str) throws NoMatchFoundException {
        if (!"University".equals(str)) {
            throw new NoMatchFoundException(
                    "NoMatchFoundException: The string '" + str + "' does not match 'University'.");
        }
    }
}
