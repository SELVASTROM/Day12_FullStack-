import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Integer input=Integer.valueOf(s.nextInt());
        String input1="1234";
        Integer input2=Integer.parseInt(input1);
        Integer input3=Integer.compare(input,100);
        System.out.println("After converting is "+input2);
        System.out.println("After comparing the both values is "+input3);
        System.out.println("The maxinum value is "+Integer.MAX_VALUE);
        System.out.println("The minimum value is "+Integer.MIN_VALUE);
        s.close();
    }
    
}
