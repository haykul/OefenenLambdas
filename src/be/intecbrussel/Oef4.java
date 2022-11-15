package be.intecbrussel;

import java.util.function.BiConsumer;

public class Oef4 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> consumer= (a1, a2)->{
            System.out.println("the mul is: "+ (a1*a2));
        };
        consumer.accept(20,15);


    }
}

