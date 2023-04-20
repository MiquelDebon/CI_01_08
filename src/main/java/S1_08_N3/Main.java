package S1_08_N3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Alumne> alumneList = retornaLLista();

        System.out.println("☑️Nom i edat:");
        alumneList.stream()
                .map(p -> p.getNom() + " " + p.getEdat())
                .forEach(System.out::println);

        System.out.println("\n☑️Nova llista alumnes 'A%':");
        List<Alumne> A_alumnes = alumneList.stream()
                .filter(p -> p.getNom().startsWith("A"))
                .collect(Collectors.toList());
        A_alumnes.forEach(System.out::println);

        System.out.println("\n☑️Alumnes amb nota >= 5:");
        alumneList.stream()
                .filter(p -> p.getNota() >= 5)
                .forEach(System.out::println);

        System.out.println("\n☑️Alumnes amb nota >= 5 && !PHP:");
        alumneList.stream()
                .filter(p -> p.getNota() >= 5 && !p.getCurs().equalsIgnoreCase("PHP"))
                .forEach(System.out::println);

        System.out.println("\n☑️Alumnes de JAVA i edat>=18:");
        alumneList.stream()
                .filter(p -> p.getEdat() >= 18 && p.getCurs().equalsIgnoreCase("JAVA"))
                .forEach(System.out::println);
    }


    public static List<Alumne> retornaLLista(){
        List<Alumne> lista = new ArrayList<>();
        lista.add(new Alumne("Miquel", 20,"JAVA", 8));
        lista.add(new Alumne("Marta", 22,"PHP", 1));
        lista.add(new Alumne("Julia", 23,"NODE", 2));
        lista.add(new Alumne("Jordi", 24,"JAVASCRIPT", 3));
        lista.add(new Alumne("Anna", 19,"HTML", 4));
        lista.add(new Alumne("Andrea", 18,"JAVA", 5));
        lista.add(new Alumne("Silvia", 17,"PHP", 6));
        lista.add(new Alumne("Eduard", 44,"NODE", 7));
        lista.add(new Alumne("Anderson", 8,"JAVA", 9));
        lista.add(new Alumne("Daniel", 19,"SpringBoot", 10));
        return lista;
    }
}
