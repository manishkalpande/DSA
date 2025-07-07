package dsa;

import java.util.*;

public class LetterCombinations {
    public static void main(String[] args) {
        letterCombinations("23");
    }

    public static List<String> letterCombinations(String digits) {
        Map<Integer,List<String>> map=new HashMap<>();

        map.put(2,Arrays.asList("a","b","c"));
        map.put(3,Arrays.asList("d","e","f"));
        map.put(4,Arrays.asList("g","h","i"));
        map.put(5,Arrays.asList("j","k","l"));
        map.put(6,Arrays.asList("m","n","o"));
        map.put(7,Arrays.asList("p","q","r","s"));
        map.put(8,Arrays.asList("t","u","v"));
        map.put(6,Arrays.asList("w","x","y","z"));

        char[] ls=digits.toCharArray();

        for(char c:ls){
            List<String> sub=map.get(c);
            for(String s:sub){

            }
        }




    }

}
