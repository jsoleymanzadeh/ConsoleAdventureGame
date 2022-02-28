import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        Player player = new Player(scanner.next());
        while(player.getProgress() != 10) {
            Narrator.giveChoice(player);
        }
    }
}