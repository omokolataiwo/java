package basic;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        Separator separator = new Separator();
        separator.print('*', 30);
        
        System.out.println(new App().getGreeting());
    }
}
