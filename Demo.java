import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = s.next().charAt(0);

        // Ensure java.lang.Character is used
        System.out.println("Is digit? " + java.lang.Character.isDigit(ch));
        System.out.println("Is letter? " + java.lang.Character.isLetter(ch));
        System.out.println("Is uppercase? " + java.lang.Character.isUpperCase(ch));
        System.out.println("Is lowercase? " + java.lang.Character.isLowerCase(ch));
        System.out.println("To Upper Case: " + java.lang.Character.toUpperCase(ch));
        System.out.println("To Lower Case: " + java.lang.Character.toLowerCase(ch));
        System.out.println("Is whitespace? " + java.lang.Character.isWhitespace(ch));

        s.close();
    }
}
