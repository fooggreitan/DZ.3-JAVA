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


        // Iterator<Integer> iterator  = mixed.iterator();
        // while(iterator.hasNext()){
        //     int res = iterator.next();
        //     if(res)
        // }

        // for (int i = 0; i < mixed.size(); i++) {
        //     for (int j = 0; j < mixed.size(); j++) {
        //         if (mixed.get(j) > mixed.get(j + 1)) {
        //             min = mixed.get(j);
        //         }
        //     }
        // }

    }

    /* 
   Данный код проверяет каждый элемент списка целых чисел на то, является ли он больше максимального 
   значения или меньше минимального значения.
   Переменная max хранит максимальное значение, найденное до текущей итерации цикла, а переменная 
   min хранит минимальное значение.
   В каждой итерации цикла происходит сравнение текущего элемента списка integer с переменными max и 
   min. Если integer больше текущего значения max, то max обновляется и присваивается значение integer. 
   Если же integer меньше текущего значения min, то min обновляется и присваивается значение integer.
   Таким образом, после завершения цикла max будет хранить максимальное значение из списка, а min будет хранить минимальное значение.
    */

}