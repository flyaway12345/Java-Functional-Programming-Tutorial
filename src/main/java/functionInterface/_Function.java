package functionInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        Integer increment2 = incrementByOneFunction.apply(1);
        int multiply  = multiplyBy10Function.apply(increment2);
        Function<Integer, Integer> addBy1ThenMultiplyBy10 =
                incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1ThenMultiplyBy10.apply(2));
        System.out.println(incrementBy1ThenMultiplyBiFunction.apply(1,10));

    }
    static BiFunction<Integer,Integer,Integer> incrementBy1ThenMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static Function<Integer,Integer> incrementByOneFunction = number -> number++;
    static Function<Integer,Integer> multiplyBy10Function = number -> number * 10;
    static int increment(int number){
        return number + 1;
    }
}
