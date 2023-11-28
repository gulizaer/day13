public class Title {
    public static void main(String[] args) {
        /*
        Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java
         */
        System.out.println(title("jAvA"));
    }

    public static String title(String word) {
        String result = word.substring(0,1).toUpperCase()+ word.substring(1).toLowerCase();
        return result;

    }
}
