package S1_08_N1;

import java.util.ArrayList;
import java.util.Arrays;
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

        //Exercise 1
        peopleName.removeIf(p -> "o".contains(p));
        List<String> ex1 = excercise1(peopleName);
        ex1.forEach(System.out::println);

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

    public static List<String> excercise1(ArrayList<String> list) {
        Stream<String> streamDeStrings = list.stream()
                        .filter(l -> l.contains("o"));

        return streamDeStrings.collect(Collectors.toList());
    }




}