package be.intecbrussel;

import java.util.function.Consumer;

public class Oef2 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (c) -> {
            if (c < 18) {
                System.out.println("You’re too young!");

            } else {
                System.out.println("You’re too old");
                       }
        };
        consumer.accept(25);

    }


}

