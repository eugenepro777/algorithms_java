package homework;

public class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Employee){
            Employee employee = (Employee) obj;
            if (employee.name.equals(name) && employee.age == age){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", name, age);
    }
}
