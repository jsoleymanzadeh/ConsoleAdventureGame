public class NonPlayer extends Character {
    protected String status;
    protected int friendliness;

    public NonPlayer(String charName, int charHealth, int charFriendliness) {
        super(charName, charHealth);
        this.friendliness = charFriendliness;
    }

    public int getFriendliness() {
        return this.friendliness;
    }

    public void changeFriendliness(int newFriendliness) {
        this.friendliness += newFriendliness;
        if (this.friendliness > 10) {
            this.friendliness = 10;
        } else if (this.friendliness < -10) {
            this.friendliness = -10;
        }
    }

    public boolean strike(Player target) {
        if (Math.floor(Math.random() * target.luck) < 1) {
            return false;
        } else {
            target.changeHealth(this.power * -1);
            return true;
        }
    }
}