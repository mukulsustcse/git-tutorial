
public class Hello {
    public static void main(String[] args) {
        System.out.println("Git is awesome");

        greeting("MUKUL");
        
        System.out.println("Square value of 4 is: "+ sqr(4));
    }

    public static void greeting(String name) {
        System.out.println("Welcome "+ name);
    }

    public static int sqr(int x) {
        return x*x;
    }
}