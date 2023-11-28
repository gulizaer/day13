public class Max {
    public static void main(String[] args) {

        /*
        Create a method named max, that can return
        the maximum number between two numbers
         */
        System.out.println(max(16, 19));
    }

    public static int max(int number1, int number2) {

        if (number1 > number2){
            return number1;
        }else {
            return  number2;
        }

    }
}
