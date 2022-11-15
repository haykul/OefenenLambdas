package be.intecbrussel;

import java.util.Random;
import java.util.function.Supplier;

    public class Oef3 {
    public static void main(String[] args) {
        Supplier<Integer>randomNumber=()->{
            Random random = new Random();
            return random.nextInt(4)+1;
        };
        int random = randomNumber.get();
        int percentage=0;
        switch (random){
            case 1:
                percentage = 25;
                break;
            case 2:
                percentage= 50;
                break;
            case 3:
                percentage=75;
                break;
            case 4:
                percentage=100;
                break;
        }
        System.out.println(random+ " -> "+ percentage+"%");
    }
}


