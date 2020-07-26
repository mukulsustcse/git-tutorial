
public class Hello {
    public static void main(String[] args) {
        System.out.println("Git is awesome");

        greeting("MUKUL");
        int p = sqr(4);
        System.out.println(p);
    }

    public static void greeting(String name) {
        System.out.println("Welcome "+ name);
    }

    public static int sqr(int x) {
        return x*x;
    }
}