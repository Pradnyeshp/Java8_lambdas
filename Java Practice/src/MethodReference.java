import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReference {

    public static void main(String[] args) {

        Thread thread = new Thread(MethodReference::printMessage); // Method reference
        thread.start();

        List<Person> people = Arrays.asList(
                new Person("john", "doe",24),
                new Person("abe", "smith",24),
                new Person("ross", "gellar",24),
                new Person("john", "snow",24),
                new Person("joey", "tribiani",24),
                new Person("rachel", "green",30)
        );

        // Question 1: Create method that print all elements in the list
        System.out.println("List of all people");
        printConditionally(people, p -> true, System.out::println); // Another type of method reference

    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for (Person p : people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }

    private static void printMessage(){
        System.out.println("Hello !");
    }

}
