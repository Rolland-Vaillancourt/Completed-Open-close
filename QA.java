public class QA extends Employee {
    public QA(String name) {
        super(name);
        System.out.println("QA is ready to assure quality !");
    }

     // QA
    private void test() {
        System.out.println("QA is testing...");
    }

    private void blameTheDev() {
        System.out.println("QA is blaming the dev...");
    }

    @Override
    public void doWork() {
        test();
        blameTheDev();
    }
}