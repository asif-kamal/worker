public class TextBlocks {

    public static void main(String[] args) {
        String textBlock = """
                Hello, my name is Adriano!
                I am from Italiano.
                Most babse like to eat fruits, but I
                like eating filet.
                Arr timber me fires!
                    This text block is like Python's text string creator""";

        System.out.println(textBlock);

        int age = 34;
        String name = "Adriano";
        System.out.printf("Your age is %d, %s!\n", age, name);

        for (int i = 1; i < 100001; i *= 10) {
            System.out.printf("%6d %n", i);
        }
    }
}
