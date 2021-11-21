package company.chapter2.functional.programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        // before 8
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<Integer> odd = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                odd.add(i);
            }
        }

        for (int i : odd) {
            System.out.print(i);
        }
        System.out.println();

        // stream
        System.out.println("print stream: ");
        IntStream
                .range(0, 10)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::print);


    }
}
