package S1_08_N1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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

        //Exercise 1
        printResult(excercise1(peopleName));

        //Exercise2
        printResult(excercise2(peopleName));
    }

//    public static ArrayList<String> excercise1(ArrayList<String> list) {
//        ArrayList<String> output = new ArrayList<>();
//        for(String name : list){
//            for(int i=0; i<name.length(); i++){
//                char c = name.charAt(i);
//                if(c == 'o'){
//                    output.add(name);
//                }
//            }
//        }
//        return output;
//    }

    public static void printResult(Collection c){
        c.forEach(l -> System.out.println(l));
    }

    public static List<String> excercise1(ArrayList<String> list) {
        System.out.println("Exercise 1:");
//        list.removeIf(p -> "o".contains(p));

        Stream<String> streamDeStrings = list.stream()
                        .filter(l -> l.contains("o") || l.contains("O"));

        return streamDeStrings.collect(Collectors.toList());
    }

    public static List<String> excercise2(ArrayList<String> list) {
        System.out.println("\nExercise 2:");
        Stream<String> streamDeStrings = list.stream()
                .filter(l -> l.contains("o") || l.contains("O"))
                .filter(l -> l.length() >= 5);

        return streamDeStrings.collect(Collectors.toList());
    }



}