package homework;

import java.util.Comparator;

public class LinkedList<T> {
    /**
     * Указатель на первый элемент
     */
    public Node head;

//    Узел

    public class Node{
        /**
         * Ссылка на следующий элемент
         */
        public Node next;

        /**
         * Значение узла
         */

        public T value;
    }

    /**
     * Добавление нового элемента в начало списка
     * @param value значение
     */
    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        head = node;
    }

    /**
     * Удаление первого элемента списка
     */
    public void removeFirst() {
        if (head != null){
            head = head.next;
        }
    }

    /**
     * Поиск элемента в списке по значению
     * @param value значение
     * @return узел
     */
    public Node contains(T value){
        Node node = head;
        while (node != null){
            if (node.value.equals(value))
                return node;
            node = node.next;
        }
        return null;
    }

    /**
     * Сортировка
     */
    public void sort(Comparator<T> comparator){
        Node node = head;
        while (node != null){
            Node minValueNode = node;

            Node node2 = node.next;
            while (node2 != null){
                if (comparator.compare(minValueNode.value, node2.value) > 0){
                    minValueNode = node2;
                }
                node2 = node2.next;
            }

            if (minValueNode != node){
                T buf = node.value;
                node.value = minValueNode.value;
                minValueNode.value = buf;
            }

            node = node.next;
        }
    }

    /**
     * Добавление нового элемента в конец списка
     * @param value значение
     */
    public void addLast(T value){
        Node node = new Node();
        node.value = value;
        if (head == null){
            head = node;
        } else {
            Node lastNode = head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
    }

    /**
     * Удаление последнего элемента из списка
     */
    public void removeLast(){
        if (head == null)
            return;
        Node node = head;
        while (node.next != null){
            if (node.next.next == null){
                node.next = null;
                return;
            }
            node = node.next;
        }
        head = null;
    }

    /**
     * Разворот списка, переворачивание ссылок между элементами
     */
    public void reverse() {
        Node previousNode = null;
        Node currentNode = head;
        Node nextNode = null;

        // Проходим по списку и меняем ссылки
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode; // поменяли ссылку на предыдущий узел
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode; // Переназначаем головной элемент
    }

    // переопределили метод toString() для наглядного вывода информации об узлах списка

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node node = head;
        while (node != null){
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }
        return stringBuilder.toString();
    }

}
