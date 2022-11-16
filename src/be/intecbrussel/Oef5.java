package be.intecbrussel;

import java.util.stream.IntStream;

public class Oef5 {
    public static void main(String[] args) {

        IntStream.of(5, 8, 640, 1111, 27, 16)
                .filter(number -> number % 8 == 0)
                .map(number -> number / 4)
                .forEach(number -> System.out.println(number));
    }
}


