//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String name = "Zbdoul";

        System.out.println(name.charAt(0));

        if (name.charAt(0) == 'A') {
            System.out.println("Name starts with A");
        } else {
            System.out.println("Name does not start with A");
            System.out.println(mathOne());
        }
    }
    static int mathOne() {
        return 0;
    }
}