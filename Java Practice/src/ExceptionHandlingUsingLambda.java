import java.util.function.BiConsumer;

public class ExceptionHandlingUsingLambda {

    public static void main(String[] args) {

        int[] values = {1,2,3,4,5} ;
        int mkey = 0 ;

        processing(values, mkey, wrapperLambda((value, key) -> System.out.println(value / key))) ;

    }

    private static void processing(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : numbers)
            consumer.accept(i , key);
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
        return (v, k) -> {
            try {
                consumer.accept(v,k);
            }
            catch (ArithmeticException ae){
                System.out.println("AE occured : " + ae);
            }
        };
    }

}
