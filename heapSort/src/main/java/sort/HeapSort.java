package sort;

public class HeapSort {

// Метод производит пирамидальную сортировку массива
    public static void heapSort(int[] array) {
        int n = array.length;

        // построение max-кучи
        buildHeap(array, n);

        // извлечение элементов из max-кучи
        for (int i = n - 1; i >= 1 ; i--) {
            // помещаем текущий корень (самый большой элемент)
            // в конец массива
            swap(array, 0, i);

            // повторно преобразуем max-кучу без последнего извлеченного элемента
            heapify(array, i, 0);
        }
    }

//    Метод для построения max-кучи
    private static void buildHeap(int[] array, int n) {
        for (int i = n / 2 - 1; i >= 0 ; i--) {
            heapify(array, n, i);
        }
    }

//    Метод для преобразования поддерева, корнем которого является узел i
    private static void heapify(int[] array, int n, int i) {
        int largest = i; // устанавливаем наибольший элемент как корень
        int left = 2 * i + 1; // устанавливаем левого потомка узла
        int right = 2 * i + 2; // устанавливаем правого потомка узла

        // если левый потомок больше родителя, то он становится корнем
        if (left < n && array[left] > array[largest]){
            largest = left;
        }

        // если правый потомок больше, чем самый большой элемент на данный момент
        if (right < n && array[right] > array[largest]){
            largest = right;
        }
        // если самый большой элемент не корень
        if (largest != i) {
            swap(array, i, largest);

            // рекурсивно преобразуем затронутое поддерево
            heapify(array, n, largest);
        }
    }
//    Метод для обмена элементов массива
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
