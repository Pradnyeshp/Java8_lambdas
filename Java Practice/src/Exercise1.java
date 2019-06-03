import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Exercise1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("john", "doe",24),
            new Person("abe", "smith",24),
            new Person("ross", "gellar",24),
            new Person("john", "snow",24),
            new Person("joey", "tribiani",24)
        );

        // Question 1: Sort list by last name
//        Collections.sort(people, (o1, o2) -> o1.fname.compareTo(o2.fname));
        Collections.sort(people, Comparator.comparing(Person::getFname));

        // Question 2: Create method that print all elements in the list
        System.out.println("List of all people");
        printConditionally(people, p -> true);

        System.out.println();
        System.out.println("Last name starts with s");

        // Question 3: Create a method that prints all elements with last name stating with 's'
        printConditionally(people, p -> p.getLname().startsWith("s"));

        System.out.println();
        System.out.println("First name starts with j");
        // Question 4: Create a method that prints all elements with first name stating with 'j'
        printConditionally(people, p -> p.getFname().startsWith("j"));

    }

    private static void printConditionally(List<Person> people, Predicate<Person> predicate){
        for (Person p : people)
            if(predicate.test(p))
                System.out.println(p);
    }

//    interface Condition{
//        boolean test(Person p);
//    }

}
