abstract public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void doWork();

    @Override
    public 
    String toString() {
        return "Employee name: " + name;
    }
}