import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Double input=Double.valueOf(s.nextDouble());
        String m="23.45";
        double d=Double.parseDouble(m);
        System.out.println("After converting string to double is "+d);
       System.out.println(Double.isNaN(input));
        System.out.println(Double.compare(input,200));
        s.close();
    }
    
}
