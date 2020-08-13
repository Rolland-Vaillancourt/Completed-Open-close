public class Developer extends Employee {
    public Developer(String name) {
        super(name);
        System.out.println("Developer is ready to code !");
    }

    // Developers
    private void drinkCoffee() {
        System.out.println("Developer is drinking coffee...");
    }

    private void codeBugs() {
        System.out.println("Developer is adding bugs to the code...");
    }

    private void fixTheirBugs() {
        System.out.println("Developer is fixing their bugs...");
    }

    @Override
    public void doWork() {
        drinkCoffee();
        codeBugs();
        fixTheirBugs();
    }
}