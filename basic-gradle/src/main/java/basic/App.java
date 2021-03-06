package basic;

import java.util.Date;
import org.ocpsoft.prettytime.PrettyTime;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        Separator separator = new Separator();
        separator.print('*', 30);
        
        System.out.println(new App().getGreeting());

        separator.print('*', 30);
        PrettyTime prettyTime = new PrettyTime(new Date(0));
        System.out.println("This is happening: " + prettyTime.format(new Date(1000 * 60 * 60 * 24)));
    }
}
