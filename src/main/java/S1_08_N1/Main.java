package S1_08_N1;

import java.text.DateFormatSymbols;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> peopleName = new ArrayList<String>();
        peopleName.add("Miquel");
        peopleName.add("Oriol");
        peopleName.add("Olivia");
        peopleName.add("Marta");
        peopleName.add("Pol");

        System.out.println("Exercise 1:");
        printResult(exercise1(peopleName));

        System.out.println("\nExercise 2:");
        exercise2(peopleName);

        System.out.println("\nExercise 3:");
        exercise3();

        System.out.println("\nExercise 4:");
        exercise4();

        System.out.println("\nExercise 5:");
        FunctionalInterfaceEx5 Foo = () -> 3.1415;
        System.out.println(Foo.getPiValue());

        System.out.println("\nExercise 6:");
        exerise6();

        System.out.println("\nExercise 7:");
        exerise7();

        System.out.println("\nExercise 8:");
//        FIEx8 funcTionEx8 = (s) -> {
//            StringBuilder sb = new StringBuilder(s);
//            return sb.reverse().toString();
//        };

        FIEx8 funcTionEx8 = (s) ->  new StringBuilder(s).reverse().toString();
        System.out.println(funcTionEx8.reverse("Hola"));

    }


    public static void printResult(Collection c){
        c.forEach(l -> System.out.println(l));
    }

    public static List<String> exercise1(ArrayList<String> list) {
//        list.removeIf(p -> "o".contains(p));
        Stream<String> streamDeStrings = list.stream()
                        .filter(l -> l.contains("o") || l.contains("O"));
        return streamDeStrings.collect(Collectors.toList());
    }

    public static void exercise2(ArrayList<String> list) {
        list.stream()
                .filter(l -> l.contains("o") || l.contains("O"))
                .filter(l -> l.length() >= 5)
                .forEach(l -> System.out.println(l));
    }

    public static void exercise3(){
        DateFormatSymbols dt = new DateFormatSymbols();
        String[] months = dt.getMonths();
        Arrays.stream(months).toList()
                .forEach(m -> System.out.println(m));
    }

    public static void exercise4(){
        DateFormatSymbols dt = new DateFormatSymbols();
        String[] months = dt.getMonths();
        Arrays.stream(months).toList()
                .forEach(System.out::println);
    }

    public static void exerise6(){
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("Miquel");
        list.add("Mi");
        list.add("Miq");
        list.add("MiquelDebo");
        //Las tres opciones funcionna:
//        Collections.sort(list, (p1, p2) ->  (p1.length()-p2.length()));
//        list.sort((p1, p2) ->  (p1.length()-p2.length()));
        list.sort(Comparator.comparing( s -> s.length()));

        list.forEach(System.out::println);
    }

    public static void exerise7(){
        List<String> list = new ArrayList<>();
        list.add("10");
        list.add("Miquel");
        list.add("Mi");
        list.add("Miq");
        list.add("MiquelDebo");
        list.sort(Comparator.comparing( s -> s.length()));
        list.sort(Comparator.reverseOrder());
        list.forEach(System.out::println);
    }




}