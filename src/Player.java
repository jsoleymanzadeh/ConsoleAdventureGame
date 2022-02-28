public class Player extends Character {
    protected int progress;
    protected int luck;
    protected String[] inventory = new String[10];

    public Player(String charName) {
        super(charName, 10);
        this.progress = 0;
        this.luck = 0;
    }

    public int getProgress() {
        return this.progress;
    }

    public void changeHealth(int newHealth) {
        super.changeHealth(newHealth);
        if (this.health <= 0) {
            this.progress = 1;
        }
    }

    private void failedStrike(String enemy) {
        int feedback = (int) (Math.random() * 3);
        if (feedback == 0) {
            System.out.printf("%s manages to sway backward and completely avoid your attack.\n", enemy);
        } else if (feedback == 1) {
            System.out.printf("%s catches your arm in mid-swing. Luckily, you were able to shake out of the hold.\n", enemy);
        } else {
            System.out.printf("You completely miss your blow. %s is visibly confused from what you could possibly be aiming at.\n", enemy);
        }
    }

    private void successfulStrike(String opponent) {
        int feedback = (int) (Math.random() * 3);
        if (feedback == 0) {
            System.out.printf("%s drops guard for a moment. You take advantage of %s's carelessness and land a direct hit.\n", opponent, opponent);
        } else if (feedback == 1) {
            System.out.printf("%s moves to dodge your attack. You adjust your strike's trajectory and catch %s off guard.\n", opponent, opponent);
        } else {
            System.out.printf("You suddenly glance at the area behind %s. %s falls for your bluff and turns around to see what had distracted you. You strike %s in the back.\n", opponent, opponent, opponent);
        }
    }

    public void strike(NonPlayer target) {
        if (Math.floor(Math.random() * luck) < 1) {
            failedStrike(target.getName());
        } else {
            target.changeHealth(this.power * -1);
            target.changeFriendliness(-20);
        }
    }

    public void strike(Enemy target) {
        if (Math.floor(Math.random() * luck) < 1) {
            failedStrike(target.getName());
        } else {
            target.changeHealth(this.power * -1);
        }
    }

    public void failedPersuade(String opponent) {
        int feedback = (int) (Math.random() * 3);
        if (feedback == 0) {
            System.out.println();
        } else if (feedback == 1) {
            System.out.println();
        } else {
            System.out.println();
        }
    }

    public void successfulPersuade(String opponent) {
        int feedback = (int) (Math.random() * 3);
        if (feedback == 0) {
            System.out.println();
        } else if (feedback == 1) {
            System.out.println();
        } else {
            System.out.println();
        }
    }

    public void persuade(NonPlayer target) {
        if (Math.floor(Math.random() * luck) < 1) {
            target.changeFriendliness(1);
        } else {
            target.changeFriendliness(-1);
        }
    }

    public void persuade(Enemy target) {
        failedPersuade(target.getName());
    }
}