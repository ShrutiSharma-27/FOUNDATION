public class Block_scoping {
    public static void main(String[] args) {
        int a=20;
        System.out.println("a outside block="+a);
        {   //values initialized in this block will have their scope restricted to this block only called block scoping.
            int c=30;
            //int a=90; Error shown : Variable 'a' is already defined in the scope
            //,but you can change 'a', perform operations with 'a', whatever
            System.out.println("a in block="+a);
            System.out.println("c in block="+a);
        }
        System.out.println("System.out.println(c) can't get executed outside this block.");
        int c=1000; //can initialize same variable outside the block (where it's initialized earlier)
        System.out.println("System.out.println(c) will work as c named var is initialized here");
        System.out.println("new c="+c);
    }
    //same conditions applied to for loop block, while loop block....
}
