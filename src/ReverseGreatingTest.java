import java.util.Scanner;

public class ReverseGreatingTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ReverseGreeting greet = new ReverseGreeting();
        greet.getUserInput(in);
        greet.printGreating();

        in.close();

    }
}
