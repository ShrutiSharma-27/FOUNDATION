public class Shadowing { //using 2 variables with the same name within the scope that overlaps
    static int x=90; //to use anything inside static, it must be static itself
    public static void main(String[] args) {
        System.out.println("before initializing x in main, x is " +x);
        int x=10;//another 'x' variable with same name
        System.out.println("after initializing x in main, x is "+x);
        prin();
    }

    static void prin(){
        System.out.println("in function prin() x is "+x);
    }
}
