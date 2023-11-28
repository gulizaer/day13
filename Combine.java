public class Combine {
    public static void main(String[] args) {
        /*
         Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same,
         return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
         */
        System.out.println(combin("gulzare","erkin"));
    }

    public static String combin(String word1, String word2) {
        String result = word1+word2;

        if (word1.charAt(word1.length()-1) == word2.charAt(0)) {
            result= word1+word2.substring(1);
        }
        return result;
    }
}
