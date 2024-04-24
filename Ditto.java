public class Ditto implements TelcoSubscription {
    private int dataAllowance;
    private int price;

    public Ditto(int dataAllowance, int price) {
        this.dataAllowance = dataAllowance;
        this.price = price;
    }

    @Override
    public String getTelcoName() {
        return "Ditto";
    }

    @Override
    public int getPromoPrice() {
        return price;
    }

    @Override
    public boolean getUnliCallText() {
        return true;
    }

}
