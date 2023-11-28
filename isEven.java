public class isEven {
    public static void main(String[] args) {
        /*
        Create a method named isEven, that can return true if
        a number is an even number, otherwise returns false

         */
        System.out.println(isEven(58));
    }
    public static boolean isEven(int number) {
        if (number%2==0){
            return true;
        }else{
            return false;
        }

    }
}
