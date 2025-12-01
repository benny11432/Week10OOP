package ie.atu;

public class PreferredCustomer extends Customer {
    private int loyaltyPoints; // total points earned
    private double discountLevel; // 0.05 for 5%, etc

    public PreferredCustomer(String name, String address, String phoneNumber,
                             int customerNumber, boolean mailingList,
                             int loyaltyPoints) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }

    public PreferredCustomer() {
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0.0;
    }

    private void updateDiscountLevel() {
        if (loyaltyPoints < 500) {
            discountLevel = 0.0;
        } else if (loyaltyPoints < 1000) {
            discountLevel = 0.05;
        } else if (loyaltyPoints < 1500) {
            discountLevel = 0.06;
        } else if (loyaltyPoints < 2000) {
            discountLevel = 0.07;
        } else {
            discountLevel = 0.10;
        }
    }

    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel();
    }

    // Getters and setters
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();
    }
    public double getDiscountLevel() {
        return discountLevel;
    }

    @Override
    public String toString() {
        return "PreferredCustomer{" +
                "customer=" + super.toString() +
                ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '}';
    }
}
