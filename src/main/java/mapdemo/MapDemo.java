package mapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        List alumnos = new ArrayList();
        alumnos.add("Carlos");
        alumnos.add(1);
        String h = (String) alumnos.get(1);
        System.out.println(h);
    }
}
