import java.util.*;

public class Function_returntypes {
    public static void main(String[] args) {
        greet();
        System.out.println(Sum());
        System.out.println(GiveBack());
    }
    //1.void function
    static void greet(){
        System.out.println("Hello people !");
    }

    //2.int function
    static int Sum(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 2 nos : ");
        int a=input.nextInt();
        int b=input.nextInt();
        return a+b;
    }

    //3.String function
    static String GiveBack(){
        Scanner input1=new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = input1.next();
        return s ;
    }
}
