package homework;

public class Program {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Anastasia", 33);
        Employee employee2 = new Employee("Nikolai", 32);


        LinkedList<Employee> linkedList1 = new LinkedList<>();
        linkedList1.addFirst(new Employee("Catrin", 43));
        linkedList1.addFirst(new Employee("Anatolii", 25));
        linkedList1.addFirst(new Employee("Nadin", 32));
        linkedList1.addFirst(new Employee("Eugene", 55));
        linkedList1.addFirst(employee1);
        linkedList1.addFirst(new Employee("Andrei", 45));
        linkedList1.addFirst(new Employee("Dmitrii", 22));

        System.out.println("Связный список из наших работников");
        System.out.println(linkedList1);

        System.out.println("Перевернутый список");
        linkedList1.reverse();
        System.out.println(linkedList1);

        System.out.println("Отсортированный по возрастанию");
        linkedList1.sort(new EmployeeComparator(SortType.Ascending));
        System.out.println();
        System.out.println(linkedList1);

        System.out.println("Отсортированный по убыванию");
        linkedList1.sort(new EmployeeComparator(SortType.Descending));
        System.out.println();
        System.out.println(linkedList1);

        LinkedList<Employee>.Node node = linkedList1.contains(employee1);
        if (node != null){
            System.out.println("Элемент найден");
            System.out.println("Значение элемента: " + node.value);
        } else {
            System.out.println("Элемент не найден");
        }

        System.out.println();
        System.out.print("Список после удаления первого и последнего элемента");
        linkedList1.removeFirst();
        linkedList1.removeLast();
        System.out.println();
        System.out.println(linkedList1);
    }
}
