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
            System.out.println(isCapital( "A"));
        }
    }
    static int mathOne(){
// **Wrapper Classes**: In Java, wrapper classes turn primitive date types (int, char, double, etc.) into objects.

// **Autoboxing**: The automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes.

//**Unboxing**: The reverse of autoboxing,. It is the automatic conversion of wrapper classes back to their respective primitive types.

//Autoboxing
        Integer Myinteger = 25;

        int num = Myinteger;

        return num;

    }

    static void stringOne(){
        //Create and use Strings

        String name = "Francisco";

        String newStr = new String("Put it in the Bag !");


    }

    static String escape() {
        return "\"Monique\" \nHarris";
    }
    static boolean isCapital(String c){
        if(c == c.toUpperCase() ){

           return true;
        }else{
            return false;
        }

    }
}