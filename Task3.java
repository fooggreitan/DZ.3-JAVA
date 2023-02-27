import java.util.ArrayList;
// import java.util.Iterator;

// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее 
// арифметичское этого списка.

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> mixed = new ArrayList<>();
 
        mixed.add(2);
        mixed.add(5);
        mixed.add(3);
        mixed.add(1);
        mixed.add(10);
        mixed.add(8);
        mixed.add(3);

        int min = mixed.get(0);
        int max = mixed.get(0);
        float sum = 0;

        for (Integer integer : mixed) {
            
            if(integer > max) max = integer;
            else if (integer < min) min = integer;

            sum = integer + sum;
        }

        System.out.println("Минимальное этого списка - > " + min);
        System.out.println("Максимальное этого списка - > " + max);
        System.out.println("Cреднее арифметичское этого списка - > " + sum/mixed.size());
    }
}