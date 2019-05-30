package basic;

public class Separator {
    public void print(char separatorChar, int size) {
        while (--size > 0) {
            System.out.print(separatorChar);
        }
        System.out.println();
    }
}

