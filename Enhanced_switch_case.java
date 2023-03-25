import java.util.*;

public class Enhanced_switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fruit : ");
        String fruit = input.next();

        //Switch Case
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("Red colored sweet fruit");
            case "Orange" -> System.out.println("Orange juicy fruit");
            default -> System.out.println("Fruit not added");
        }
    }
}
