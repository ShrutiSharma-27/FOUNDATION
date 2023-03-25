import java.util.*;

public class Function_array_change {
    public static void main(String[] args) {
        int[] arr = {1,45,89,10,18};
        System.out.println("Array before function call "+Arrays.toString(arr));
        change(arr);
        System.out.println("Array after function call  "+Arrays.toString(arr)); //object in main is changed using array as reference variable
    }

    static void change(int[] nums){
        nums[0]=100;
        nums[3]=1000;
    }
}
