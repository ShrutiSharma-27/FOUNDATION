import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = input.nextInt();

        int rev = 0;
        while(n != 0){
            int rem = n%10;
            rev = rev*10 + rem;
            n/=10;
        }
        System.out.println("Reverse is : "+rev);
    }
}