public class Globe implements TelcoSubscription {
    private int dataAllowance;
    private int price;

    public Globe(int dataAllowance, int price) {
        this.dataAllowance = dataAllowance;
        this.price = price;
    }

    @Override
    public String getTelcoName() {
        return "Globe";
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
