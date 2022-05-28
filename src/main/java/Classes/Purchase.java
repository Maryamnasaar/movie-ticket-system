package Classes;

public class Purchase {
    String itemName;
    Double amountPaid;

    public Purchase() {
        this.amountPaid = 0.0;
        this.itemName = "";
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Purchase(String itemName, Double amountPaid) {
        this.itemName = itemName;
        this.amountPaid = amountPaid;
    }
}