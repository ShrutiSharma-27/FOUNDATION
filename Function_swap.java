//using primitive data types, only value is passed via reference variable as arguments in function : no change in original value
//using non-primitive data types, also passed by value but original value is changed as the argument passed point or refer to the same(original) object

public class Function_swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+b);
        System.out.println("Not swapped on calling function");

        String name = "Spider man";
        change(name);
        System.out.println("After using change() method name is : "+name); //will not reflect Rickshaw
    }

    static void change(String naam) {
        naam = "Rickshaw";
    }

    static void swap(int a, int b){
        int temp=a;
        a=b; //creating a new object
        b=temp;
        //if you will use array as reference variable to make change in object then the same(original) object will get change
        //this change is valid in this function only
    }
}
