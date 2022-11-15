package be.intecbrussel;

import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Oef1 {
    public static void main(String[] args) {

        // parameter, no return
        Consumer<String> shopping = (String fruits) -> System.out.println("buying a: " + fruits);
        shopping.accept("Banana");
        // return, no parameter
        Supplier<String> dateAndTime = () -> {
            String dateTimeNow = LocalDateTime.now().toString();
            return "Local time is: " + dateTimeNow;
        };
        System.out.println(dateAndTime.get());
        // parameter, return
        Function<String, Integer> wordLength = (String word) -> word.length();
        System.out.println(wordLength.apply("Ecuador"));
        // no return, no parameter
        Runnable simple = () -> {
            System.out.println("Finish");
        };
        simple.run();
    }
}

