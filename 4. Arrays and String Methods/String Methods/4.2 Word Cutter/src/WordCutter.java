public class WordCutter {
    //code the method cutInHalf that returns the first half of the String passed as argument
    /* Code the cutInHalf method that returns the first half of the word input. */
    public static String cutInHalf(String word) {
        int length = word.length();
        return word.substring(0, length / 2);
    }
}