import java.util.ArrayList;
import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Character> ch=new ArrayList<>();
                System.out.println("Enter one character please!");
        char cc=s.next().charAt(0);
        if(java.lang.Character.isDigit(cc)){
            System.out.println("You entered number instead of Character");
        }else if(java.lang.Character.isUpperCase(cc)){
            System.out.println("you entered the Upper case character but i need only  lower chase character "+java.lang.Character.toLowerCase(cc));
        }else{
            System.out.println("congrulations you printed the correct character "+cc);
        }
        s.close();
    }
    
}
