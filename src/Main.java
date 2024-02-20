import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PromptItem promptItem = new PromptItem();
        System.out.println(promptItem.promptString());
        System.out.println(promptItem.promptDouble());
        System.out.println(promptItem.promptInteger());
    }

    public static Scanner input = new Scanner(System.in);
}