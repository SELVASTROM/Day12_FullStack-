import java.util.*;
class Autobox{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the stri1ng input");
        String num=s.nextLine();
        int num1=Integer.parseInt(num);
        int result=num1+100;
        System.out.println("After converting string to int is "+result);
        s.close();
    }
    //     float a=22.64f;
    //     Float b=a;
    //     float c=b;
    //     System.out.println("The result of autoboxing "+b+"\n the result of unboxing "+c);
    // }
}