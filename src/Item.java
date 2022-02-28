abstract class Item {
    protected int weight;
    protected int quantity;

    public Item(int itemWeight) {
        this.weight = itemWeight;
        this.quantity = 1;
    }

    public Item(int itemWeight, int itemQuantity) {
        this.weight = itemWeight;
        this.quantity = itemQuantity;
    }

    public void changeQuantity(int newQuantity) {
        this.quantity += newQuantity;
    }
}