package be.intecbrussel.ex_2;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamOperations {

    public static void main(String[] args) {

        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        //original values
        IntStream.of(values).forEach(value -> System.out.printf("%d ",value));

        //count of values
        System.out.printf("%nCount: %d%n", IntStream.of(values).count());

        //min of values
        System.out.printf("Min: %d%n", IntStream.of(values).min().getAsInt());

        //max of values
        System.out.printf("Max: %d%n", IntStream.of(values).max().getAsInt());

        //sum of values
        System.out.printf("Sum: %d%n", IntStream.of(values).sum());

        //average of values
        System.out.printf("Average: %.2f%n", IntStream.of(values).average().getAsDouble());

        //sum of values with reduce method
        System.out.printf("%nSum via reduce method: %d%n",
                IntStream.of(values).reduce(0, (x,y)->x+y));

        //sum of squares values with reduce method
        System.out.printf("Sum of squares via reduce method: %d%n",
                IntStream.of(values).reduce(0,(x,y)->x + y*y));

        // product of values with reduce method
        System.out.printf("Product via reduce method: %d%n",
                IntStream.of(values).reduce(1, (x,y)->x*y));

        // even values displayed in sorted order
        System.out.printf("%nEven values displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value%2==0)
                .sorted()
                .forEach(value -> System.out.printf("%d ",value));
        System.out.println();

        // odd values multiplied by 10 and displayed in sorted order
        System.out.printf("Odd values multiplied by 10 displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value%2==1)
                .map(value->value*10)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));

        // sum range of integers from 1 to 10, exlusive
        System.out.printf("%nSum of integers from 1 to 9: %d%n",
                IntStream.range(1,10).sum());

        System.out.println(IntStream.of(values).summaryStatistics());

    }
}
