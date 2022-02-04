package lesson20;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Loader {
    public static List<Person> load(){
        return asList(
                new Person(1, "N1"),
                new Person(2,"N2"),
                new Person(3, "N3")
        );
    }
}
