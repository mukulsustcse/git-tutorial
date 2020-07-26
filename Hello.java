
public class Hello {
    public static void main(String[] args) {
        System.out.println("Learning Git Merge and Merge conflict...");

        display();
        
        System.out.println("CUBE value of 4 is: "+ sqr(4));
    }

    
    public static void greeting(String name) {
        System.out.println("Bye bye "+ name);
    }
    
        public static void display() {
        System.out.println("Hey hey hey");
    }

    public static int sqr(int x) {
        return x*x*x;
    }
}