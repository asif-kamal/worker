public class Main {

    public static void main(String[] args) {
        SalariedEmployee jim = new SalariedEmployee("Jim", 1989, 2026, 60000,
                true, 2024);

        System.out.println(jim.collectPay());
        System.out.println(jim.getAge());

        System.out.println(jim);
    }
}
