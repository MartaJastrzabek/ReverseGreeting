import java.util.Scanner;

public class ReverseGreeting {
    private String[] names = new String[5];

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public void getUserInput(Scanner scanner){
        for(int i = 0; i<names.length; i++){
            System.out.println("Podaj imię nr: " + (i+1));
            names[i] = scanner.nextLine();
        }
    }

    public void printGreating(){
        for (int i = 4; i>=0; i--){
            System.out.println("Cześć " + names[i]);
        }
    }
}
