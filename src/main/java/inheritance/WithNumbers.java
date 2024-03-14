package inheritance;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class WithNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        printList(numbers);

        List<Double> dobles = new ArrayList<>();
        dobles.add(1.0);
        dobles.add(3.7);
        printList(dobles);

    }

    private static void printList(@NotNull List<? extends Number> numbers) {

        numbers.forEach(System.out::println);
        Number number = numbers.get(0);

    }
}
