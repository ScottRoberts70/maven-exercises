import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.printf("You entered: %s\n", userInput);
        if (!StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is not a number!");
        }
    }
}
//"Life, The Universe, and Everything" is not a number