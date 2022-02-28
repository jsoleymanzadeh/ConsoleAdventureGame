public class Armor extends Item {
    protected int protection;

    public Armor(int itemWeight, int armorProtection) {
        super(itemWeight);
        this.protection = armorProtection;
    }

    public Armor(int itemWeight, int itemQuantity, int armorProtection) {
        super(itemWeight, itemQuantity);
        this.protection = armorProtection;
    }
}