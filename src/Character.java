abstract class Character {
    protected String name;
    protected int health;
    protected int power;

    public Character(String charName, int charHealth) {
        this.name = charName;
        this.health = charHealth;
        this.power = 0;
    }

    public Character(String charName, int charHealth, int charPower) {
        this.name = charName;
        this.health = charHealth;
        this.power = charPower;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public void changeHealth(int newHealth) {
        this.health += newHealth;
        if (this.health <= 0) {
            System.out.printf("%s has died.\n", this.name);
        }
    }

    public void changePower(int newPower) {
        this.power += newPower;
    }
}