import java.util.Scanner;

public class Narrator {
    public static void giveChoice(Player player) {
        Scanner scanner = new Scanner(System.in);
        switch (player.getProgress()) {
            case 0:
                System.out.println("You ");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}