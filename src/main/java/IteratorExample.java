import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        Iterator<String> iterator = list.iterator();
        var i = iterator.next();
        System.out.println(i);


    }
}
