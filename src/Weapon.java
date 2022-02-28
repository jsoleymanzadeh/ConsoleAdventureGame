public class Weapon extends Item {
    protected int lethality;
    protected int protection;

    public Weapon(int itemWeight, int weaponDeadliness, int weaponProtection) {
        super(itemWeight);
        this.lethality = weaponDeadliness;
        this.protection = weaponProtection;
    }

    public Weapon(int itemWeight, int itemQuantity, int weaponDeadliness, int weaponProtection) {
        super(itemWeight, itemQuantity);
        this.lethality = weaponDeadliness;
        this.protection = weaponProtection;
    }
}