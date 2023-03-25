import java.util.*;

public class Function_sum_hello {
    public static void main(String[] args) {
        int s;
        s= Sum(10,20);
        System.out.println(s);
        System.out.println(sayHello("Shruti Sharma"));

        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println(sayHello(name));

    }
    static int Sum(int a, int b){
        int sum = a+b;
        return sum;
    }

    static String sayHello (String name){
        String s = "Hello "+name+" !";
        return s;
    }
}
