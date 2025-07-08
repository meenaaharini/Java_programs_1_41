import java.util.*;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person("Anu", 20), new Person("John", 17));
        people.stream().filter(p -> p.age() >= 18).forEach(System.out::println);
    }
}