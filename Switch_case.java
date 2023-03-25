import java.util.*;

public class Switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fruit : ");
        String fruit = input.next();

        //Switch Case
        switch (fruit){
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("Red colored sweet fruit");
                break;
            case "Orange":
                System.out.println("Orange juicy fruit");
                break;
            default:
                System.out.println("Fruit not added");
                //suppose case a is satisfied and if it doesn't have break within itself then the further cases will get executed until we encounter a break statement.
                //and if it doesn't have break till default then cases with default statements also get executed.
        }
    }
}
