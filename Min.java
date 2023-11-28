public class Min {
    public static void main(String[] args) {
        /*
        Create a method named min, that can return
        the minimum number between two numbers
         */
        System.out.println(min(100, 200));
    }

    public static int min(int number1, int number2) {
        if (number1<number2){
            return number1;
        }else {
            return number2;
        }


    }
}
