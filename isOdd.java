public class isOdd {
    public static void main(String[] args) {

        /*
         Create a method named isOdd, that can return true
         if a number is an odd number, otherwise returns false
         */

        System.out.println(isOdd(60));
    }

    public static boolean isOdd(int number) {

        if (number%2 !=0){
            return true;
        }else{
            return false;
        }

    }


}
