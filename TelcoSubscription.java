public interface TelcoSubscription {
  String getTelcoName();
  int getPromoPrice();
  boolean getUnliCallText();
}

public interface Promotion {
  String showAllowance(String telcoName, int promoPrice);
  String showUnliCallsTextOffer(String telcoName, boolean unliCallText);
}
