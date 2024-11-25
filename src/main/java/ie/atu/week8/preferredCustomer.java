package ie.atu.week8;

public class preferredCustomer extends Customer{

    private int loyaltypoints;

    private int discount;

    public preferredCustomer() {
        super();
        this.loyaltypoints = 0 ;
        this.discount = 0;
    }

    public preferredCustomer(int loyaltypoints, int discount) {
        super();
        this.loyaltypoints = loyaltypoints;
        this.discount = discount;
    }

    public int getLoyaltypoints() {
        return loyaltypoints;
    }

    public void setLoyaltypoints(int loyaltypoints) {
        this.loyaltypoints = loyaltypoints;
        if (loyaltypoints>=2000) {
            this.discount = 10;
        }
        else if (loyaltypoints>=1500) {
            this.discount = 7;
        }
        else if (loyaltypoints>=1000) {
            this.discount = 6;
        }
        else if (loyaltypoints>=500) {
            this.discount = 5;
        }
        else{
            this.discount = 0;
        }
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString()+
                "preferredCustomer{" +
                "loyaltypoints=" + loyaltypoints +
                ", discount=" + discount +"%"+
                '}';
    }
}

