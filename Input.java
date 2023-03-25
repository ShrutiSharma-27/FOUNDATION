import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        System.out.print("Hey user !\nEnter an integer : ") ;
        int no = input.nextInt() ;
        System.out.print("\nEnter a word : ") ;
        String word = input.next() ;
        System.out.println("hi");
        System.out.print("\nEnter a sentence : ") ;

        Scanner take = new Scanner(System.in); //you have to make another scanner obj to take another str input
        String vakya = take.nextLine();
        System.out.println(vakya);
    }
}
