package sev.tryouts;

import java.util.Random;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Random random = new Random();
        Long count = random.nextLong() * 10000;
        for (int i = 0; i < count; i++) {
            System.out.println("Hello " + i);
        }

    }
}
