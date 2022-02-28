public class Action {
    public static void attack(Player player, Enemy enemy) {
        player.strike(enemy);
    }

    public static void attack(Player player, NonPlayer character) {
        player.strike(character);
    }

    public static void attack(Enemy enemy, Player player) {
        enemy.strike(player);
    }

    public static void attack(NonPlayer nonPlayer, Player player) {
        nonPlayer.strike(player);
    }

    public static void persuade(Player player, Enemy enemy) {
        player.persuade(enemy);
    }

    public static void persuade(Player player, NonPlayer nonPlayer) {
        player.persuade(nonPlayer);
    }
}