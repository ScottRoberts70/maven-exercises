import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Something: ");
        String reply = scan.nextLine();
        if (StringUtils.isNumeric(reply)){
            System.out.println("\"" + reply + "\"" + " is a number!");
        } else {
            System.out.println("\"" + reply + "\"" + " is not a number!");
        }

        System.out.println(StringUtils.swapCase(reply));
        System.out.println("This is your answer reversed! " + "\"" + StringUtils.reverse(reply) + "\"");


    }
}









