import java.util.Arrays;
import java.util.List;

public class CollectionIteration {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("john", "doe",24),
                new Person("abe", "smith",24),
                new Person("ross", "gellar",24),
                new Person("john", "snow",24),
                new Person("joey", "tribiani",24)
        );

        System.out.println("Using java 8 lambdas internal loop");

        people.forEach(System.out::println);

        people.forEach(p->System.out.println(p.getFname()));


    }

}
