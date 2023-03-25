import java.util.*;

//used a lot of type casting

public class Print_digits1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = input.nextInt();
        int ns = n; //stored value of n

        //first we'll count the number of digits present in number
        int count = 0; //count of digits

        while(n != 0){
            n/=10;
            count+=1;
        }
        System.out.println("count = "+count);

        for(int i=count-1 ; i>=0 ; i--){            //this way is best : if we've used while(ns != o) then for 100 it will print only 1
            int rem = ns%(int)(Math.pow(10.00,i));   //but we've taken into account no. of digits to resolve this
            int quo = ns/(int)(Math.pow(10.00,i));
            System.out.println(quo);
            ns=(int)rem;
        }
    }
}
