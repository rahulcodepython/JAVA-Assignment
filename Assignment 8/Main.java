public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No integers provided. Please provide at least one integer.");
            return;
        }

        try {
            int largest = Integer.parseInt(args[0]);

            for (String arg : args) {
                int number = Integer.parseInt(arg);
                if (number > largest) {
                    largest = number;
                }
            }

            System.out.println("The largest value is: " + largest);
        } catch (NumberFormatException e) {
            System.out.println(
                    "Error: One or more arguments are not valid integers. Please provide only integer values.");
        }
    }
}
