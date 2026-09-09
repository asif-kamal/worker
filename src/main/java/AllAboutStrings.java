public class AllAboutStrings {

    public static void main(String[] args) {
        String helloWorld = "Hello World";
        int length = helloWorld.length();
        System.out.printf("index of second l: %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of second to last l: %d %n", helloWorld.lastIndexOf('l', 8));
    }
}
