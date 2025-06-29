package dsa;

import java.util.HashMap;
import java.util.Map;

public class FindCharInSTring {

    public static void main(String[] args) {
        String s="Manishss";


        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }


        System.out.println(map);

    }
}
