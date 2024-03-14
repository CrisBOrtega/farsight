package zoo;

import java.util.HashMap;
import java.util.Map;

public class Zoo {

    public static void main(String[] args) {
        //Cage<Mono> cage = new Cage<Mono>(new Mono(), new Mono());
        //cage.setAnimal1(new Mono());
        //cage.setAnimal2(new Mono());
        //Mono mon1 = cage.getAnimal1();

        Mono mono1 = new Mono();
        mono1.setType("Feral");
        Mono mono2 = new Mono();
        mono2.setType("Ape");
        System.out.println( Cage.isCompatible(mono1 , mono2));
        Map<String , Cage> petstore = new HashMap<String, Cage>();
        petstore.put("C1" , new Cage<>(mono1 , mono2));
        petstore.put("C2" , new Cage<>(mono1,  mono2));

        for (Map.Entry<String, Cage> jaula : petstore.entrySet()){
            System.out.println(jaula.getKey());
            System.out.println(jaula.getValue().getAnimal1().getType());
            System.out.println(jaula.getValue().getAnimal2().getType());
            System.out.println("_____________");
        }

    }
}
