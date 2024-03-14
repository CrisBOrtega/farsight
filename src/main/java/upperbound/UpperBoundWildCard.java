package upperbound;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildCard {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        printList(integers);

        List<Double> dobles = new ArrayList<>();
        dobles.add(1.0);
        dobles.add(2.0);
        printList(dobles);

        //addToList(integers , 10);

        List<Number> numbers = new ArrayList<>();
        numbers.add(10);
        addToList(numbers , 10);

        //Todo: como se puede hacer con una lista de enteros
        //addToList(integers , 10);
        //PECS Producer Extends Consumer Super
    }


    private static void addToList(List<? super Number> numbers, Number i) {
        numbers.add(i);
    }

    private static void printList(List<? extends Number> numbers) {
        numbers.forEach(System.out::println);
        Number n = numbers.get(0);
    }
}
