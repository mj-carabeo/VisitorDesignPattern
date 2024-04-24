public class Smart implements TelcoSubscription {
  private int dataAllowance;
  private int price;

  public Smart(int dataAllowance, int price) {
    this.dataAllowance = dataAllowance;
    this.price = price;
  }

  @Override
  public String getTelcoName() {
    return "Smart";
  }

  @Override
  public int getPromoPrice() {
    return price;
  }

  @Override
  public boolean getUnliCallText() {
    return false;
  }

}
