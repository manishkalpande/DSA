package dsa;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

public class StreamFunction {

    public static void main(String[] args) {
        List<String> objects = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);


        List<String> word=Arrays.asList("java","oracle","Microservice","Api","abc");

        String str="manish";


        objects.stream().filter(word::contains).forEach(System.out::println);

        objects.stream().filter(str::equalsIgnoreCase).distinct().forEach(System.out::println);

        objects.stream().map(s -> s.length()>2).collect(Collectors.toList()).forEach(System.out::println);

//        Collections.sort(word,Comparator.comparing(String::));

        List<Employee> employees =Arrays.asList(new Employee(1,"Manish",1100.0,"Mumbai"),new Employee(1,"Harshit",1700.0,"Bhopal"),new Employee(1,"Pawan",4000.0,"Hinjewadi"));

        Collections.sort(employees,Comparator.comparing(Employee::getSalary));

//        System.out.println(employees);

        Optional<String> optionalS=word.stream().reduce((a,b)-> a.compareTo(b)==0?a:b);

        optionalS.ifPresent(System.out::println);

//        Optional<Integer> sum = numbers.stream()
//                .reduce((a, b) -> a + b);
//        sum.ifPresent(System.out::println);

//        objects.forEach(System.out::println);

        List<String> newObject=objects.stream().filter(s->s.startsWith("a")).collect(Collectors.toList());

//        System.out.println(newObject);

//        objects.stream().filter(s->);


        List<Integer> newNumbers=numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());

//        System.out.println(newNumbers);





    }

    @Data
    @AllArgsConstructor
    public static class Employee{
        Integer id;
        String name;
        Double salary;
        String address;

        public Employee(int i, String manish, double v, String mumbai) {
            this.id=i;
            this.name=manish;
            this.salary=v;
            this.address=mumbai;
        }
    }
}
