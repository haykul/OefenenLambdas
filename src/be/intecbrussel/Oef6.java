package be.intecbrussel;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class Oef6 {
    public static void main(String[] args) {
        String[] animals = {"Cow", "ShaRk", "DOg", "PirAnha", "MouSE", "CaT", "ParRoT", "DOLphin"};
       String[] newAnimals=Stream.of(animals)
                .map(animal -> animal.toLowerCase(Locale.ROOT))
                .filter(animal -> animal.contains("a"))
               .toArray(String[]::new);
            //    .forEach(animal-> System.out.println(animal));

        System.out.println(Arrays.toString(newAnimals));
    }
}
