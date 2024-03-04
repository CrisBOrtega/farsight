import java.util.Arrays;
import java.util.List;

public class AutoBoxing {

    public static void main(String[] args) {
        Integer k = 10;
        int i = k;

        System.out.println(i);

        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        int first = list.get(0);
    }
}
