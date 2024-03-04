import java.time.Month;
import java.util.ArrayList;
import java.time.LocalDate;

public class Gen {
    public static void main(String[] args) {
       ArrayList<String> names = new ArrayList<String>();
       //names.add(LocalDate.of(2024 , Month.FEBRUARY , 3));
       names.add("Name 1");
       names.add("Name 2");

       String myFriend =  names.get(0).toString();
       System.out.println(myFriend);

    }
}
