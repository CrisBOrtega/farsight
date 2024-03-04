import java.util.ArrayList;
import java.util.List;

public class GenericRunTime {

    public static void main(String[] args) {
        List<String> names  = new ArrayList<>();
        addToNames(names , "Name1");
        addToNames(names , "Name2");
        addToNames(names , "Name3");
        System.out.println(names);
        System.out.println("-------------");
        incorrecAddToNames(names , 100);
        System.out.println(names);
    }

    private static void addToNames(List<String> names, String name1) {
        names.add(name1);
    }


    private static void incorrecAddToNames(List list, Integer i) {
        list.add(i);
    }
}
