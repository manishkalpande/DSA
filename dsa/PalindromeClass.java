package dsa;

import java.util.HashSet;
import java.util.Set;

public class PalindromeClass {

    public static void main(String[] args) {
        System.out.println(isPalindrome("mmkkmm"));
        System.out.println(isPalindromea("mmkkmm"));
        System.out.println(lengthOfLongestSubstring("aassddfffll"));
    }

    public static boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Compare the cleaned string with its reverse
        String cleanedStr = cleaned.toString();
        String reversedStr = cleaned.reverse().toString();

        return cleanedStr.equals(reversedStr);
    }
    public static boolean isPalindromea(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;
    }
    public static boolean isCheck(String s) {
        int i=0, j=s.length()-1;
        while (i<j) {
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, max = 0;
        for (int right = 0; right < s.length(); right++) {
            while (!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }


}
