import java.util.*;

//Shortcut to find no of digits:
//int number_of_digits = (int)(Math.log10(number)) + 1

//USING ARRAYS
public class Print_digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number = ");
        int n = input.nextInt();
        int digit ; int digit_count = 0;
        int arr[] = new int[50];  //for safer side
        int i=0;
        while(n != 0){
            digit = n%10;
            arr[i] = digit;
            n = n/10;
            i++; digit_count+=1;
        }

        for(int j=digit_count-1 ; j>=0 ; j--){
            System.out.println(arr[j]);
        }
    }
}
