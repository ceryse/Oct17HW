public class Main {

    public static String alternateStrings(String str1, String str2) {
        String output = "";
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            output = output + str1.substring(i, i + 1) + str2.substring(i, i + 1);
        }
        String longestWord = findLongestWord(str1, str2);
        output = output + longestWord.substring(minLength);
        return output;
    }

    public static String findLongestWord(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1;
        }
        return str2;
    }

    public static boolean abcTest(String text) { //returns true if the input String contains an “abc” not directly preceded by a dot
        int index = text.indexOf("abc");
        if (index != -1) {
            if (index == 0) return true;
            if (index > 0 && !text.substring(index - 1, index).equals(".")) return true;
        }
        return false;
    }


}
