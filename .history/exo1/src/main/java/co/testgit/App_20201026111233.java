package co.testgit;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static void helloBoyandGirl(String name) {
        if ((name == null) || (name == "")) {
            return "Hello World";
        }
    }
}
