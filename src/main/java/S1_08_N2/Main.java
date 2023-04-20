package S1_08_N2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nomsPropis = new ArrayList<>(Arrays.asList("Miquel", "Pol", "Ana", "Anna", "Alb", "Silvia"));

        System.out.println("Excercici 1:");
        exercici1(nomsPropis).forEach(p -> System.out.println(p));

        System.out.println("\nExcercici 2:");
        System.out.println(exercise2(new ArrayList<>(Arrays.asList(3,55,44))));

        System.out.println("\nExcercici 3:");
        exercise3(2, 3);

        System.out.println("\nExcercici 4:");
        exercise4();

    }

    public static List<String> exercici1(List<String> list){
        return list.stream()
                .filter(a -> a.startsWith("A") && a.length() <=3)
//                .filter(a -> a.charAt(0) == 'A' && a.length() <= 3)
                .collect(Collectors.toList());
    }

    public static String exercise2 (List<Integer> numbers){
        return numbers.stream()
                .map(n -> (n % 2 == 0) ? "e"+n : "o"+n)
                .collect(Collectors.joining(", "));
    }

    public static void exercise3(float primer, float segon){
        FunInterEx3 suma = (x, y) -> x + y;
        FunInterEx3 resta = (x,y) -> x - y;
        FunInterEx3 multiplicacion = (x,y) -> x * y;
        FunInterEx3 division = (x,y) -> x/y;

        System.out.println("Suma: " + suma.operacio(primer, segon));
        System.out.println("Resta: " + resta.operacio(primer, segon));
        System.out.println("Multi: " + multiplicacion.operacio(primer, segon));
        System.out.println("Divi: " + division.operacio(primer, segon));

    }

    public static void exercise4 (){
        List<String> list = new ArrayList<>(Arrays.asList("marta", "0", "Miquel", "34", "elvisa", "ella", "Anna"));
        System.out.println("Alfabeticament: ");
        list.stream()
                .sorted(Comparator.comparing(l -> l.charAt(0))).forEach(System.out::println);

        System.out.println("\nCadena 'e' first");
        list.stream()
                .sorted((a,b) -> {
                    if(a.startsWith("e") && !b.startsWith("e")){
                        return -1;
                    } else if (b.startsWith("e") && !a.startsWith("e")) {
                        return 1;
                    }else{
                        return a.compareTo(b);
                    }
                })
                .forEach(System.out::println);

        System.out.println("\nModify 'a' -> '4'" );
        list.stream()
                .map(a -> (a.replace('a','4')))
                .forEach(System.out::println);


        System.out.println("\nMostrat només numerics");
        list.stream()
                .filter(s -> s.chars().allMatch(Character::isDigit))
                .forEach(System.out::println);


    }
}
