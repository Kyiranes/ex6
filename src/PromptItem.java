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
        while (!doubleValue) {
            System.out.println("Please enter a double: ");
            String message = Main.input.nextLine();
            try {
                parseDouble(message);
                doubleValue = true;
            }
            catch (Exception e) {
                System.out.println("This is not a double");
            }
        }
        return ("This is a double");
    }

    public String promptInteger() {
        boolean integerValue = false;
        while (!integerValue) {
            System.out.println("Please enter an integer: ");
            String message = Main.input.nextLine();
            try {
                parseInt(message);
                integerValue = true;
            }
            catch (Exception e) {
                System.out.println("This is not an integer");
            }
        }
        return ("This is an integer");
    }
}



