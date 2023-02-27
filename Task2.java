// Пусть дан произвольный список целых чисел. 
// Удалить из него чётные числа.

// import java.util.Iterator;
import java.util.LinkedList;
// import java.util.List;

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

        // Iterator<Integer> iterator  = mixed.iterator();
        // while (iterator.hasNext()) {
        //     int res = iterator.next();
        //     if (res % 2 == 0) iterator.remove();
        // }

        // Iterator<Integer> iterator  = mixed.iterator();
        // while (iterator.hasNext()) {
        //     int res = iterator.next();
        //     if (res % 2 == 0) iterator.remove();
        // }

        // Iterator<Integer> iterator  = mixed.iterator;
        // while(iterator.remove() % == 2)

        // for (int i = 0; i < mixed.size(); i++) {
        //     for (int j = 0; j < mixed.size(); j++) {
        //         if (mixed.get(j) % 2 == 0) /* { */
        //             mixed.remove(j);
        //         }
        //     }
        // }
        // System.out.println(mixed);
    }
}


// Данный код выполняет итерации по списку mixed с помощью 
// вложенных циклов for.

// Внешний цикл выполняет итерации от i = 0 до i < mixed.size(), 
// а внутренний цикл выполняет итерации от j = 0 до j < mixed.size(). 
// Таким образом, каждый элемент списка будет проверен дважды.

// Внутри вложенного цикла происходит проверка условия mixed.get(j) % 2 == 0, 
// которое проверяет, является ли текущий элемент списка четным числом. 
// Если это условие истинно, то элемент списка удаляется с помощью метода remove(j).

// Однако, при удалении элемента из списка, индексы оставшихся элементов изменяются, 
// что может привести к пропуску некоторых элементов или повторной обработке некоторых других элементов.

// Таким образом, код не является корректным и необходимо использовать другой подход для 
// удаления элементов списка. Например, можно использовать итераторы и метод removeIf для 
// удаления элементов, удовлетворяющих заданному условию.
