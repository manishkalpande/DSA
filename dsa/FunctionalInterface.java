package dsa;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");

        HashMap<Integer,String> m = new HashMap<>();
        m.put(1,"a");
        m.put(2,"b");
        m.put(3,"c");

//        m.clear();

        System.out.println(m);

        Predicate<String> isEmpty = String::isEmpty;
        Function<String, Integer> length = String::length;

        Consumer<String> print = System.out::println;

        Supplier<Double> random = Math::random;

        System.out.println(random.get());

//        list.stream().forEach(String::toUpperCase).Collect(Collections.list();

        System.out.println(list);
    }

    public List<String> generateParenthesis(int n) {
        List<String> ls=new ArrayList<>();
        // int n=0;
        for(int i=1;i<=n;i++){
            StringBuilder sb=new StringBuilder();
            sb.append("(");
            for(int j=1;j<=n;j++){
//                sb.add(")");
            }
            ls.add(sb.toString());
        }
        return ls;
    }
}
