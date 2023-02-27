// Пусть дан произвольный список целых чисел. 
// Удалить из него чётные числа.

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> mixed = new LinkedList<>();
        mixed.add(2);
        mixed.add(5);
        mixed.add(3);
        mixed.add(1);
        mixed.add(10);
        mixed.add(8);
        System.out.println(mixed);

        mixed.removeIf(res -> res % 2 == 0);
        System.out.println(mixed);
    }
}
