package sort;

import static sort.HeapSort.heapSort;

public class Program {
    public static void main(String[] args) {
        int[] array = new int[] {
                4, 2, 5, 6, 8, 1, 9, 3, 7, 8, 5, 5, 6, 8, 1, 9, 3, 7, 1
        };

        System.out.println("Массив до сортировки");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Пирамидальная сортировка");
        heapSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
