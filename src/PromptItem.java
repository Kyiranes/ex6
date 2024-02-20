import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class PromptItem {
    public String promptString() {
        boolean stringValue = false;
        while (!stringValue) {
            System.out.println("Please enter a string: ");
            String message = Main.input.nextLine();
            boolean notInteger = false;
            try {
                parseInt(message);
            } catch (Exception e) {
                notInteger = true;
            }
            boolean notDouble = false;
            try {
                parseDouble(message);
            } catch (Exception e) {
                notDouble = true;
            }
            if (notInteger && notDouble) {
                stringValue = true;

            }
        }
        return ("This is a string");

    }

    public String promptDouble() {
        boolean doubleValue = false;
        boolean notInteger = false;
        boolean notDouble = false;
        while (!doubleValue) {
            System.out.println("Please enter a double: ");
            String message = Main.input.nextLine();
            try {
                parseInt(message);
            } catch (Exception e) {
                notInteger = true;
            }
            try {
                parseDouble(message);
            } catch (Exception e) {
                notDouble = true;
            }
            if (notInteger && !notDouble) {
                doubleValue = true;

            }
        }
        return ("This is a double");
    }

    public String promptInteger() {
        boolean integerValue = false;
        boolean notInteger = false;
        boolean notDouble = false;
        while (!integerValue) {
            System.out.println("Please enter an integer: ");
            String message = Main.input.nextLine();
            try {
                parseInt(message);
            }
            catch (Exception e) {
                notInteger = true;
            }
            try {
                parseDouble(message);
            }
            catch (Exception e) {
                notDouble = true;
            }
            if (!notInteger && notDouble) {
                integerValue = true;

            }
        }
        return ("This is an integer");
    }
}



