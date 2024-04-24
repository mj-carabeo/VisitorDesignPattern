public class UsagePromo implements Promotion {
    @Override
    public String showAllowance(String telcoName, int promoPrice) {
        return telcoName + " Data Usage Offer and price: " + promoPrice;
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + " unlimited calls and text package: Not applicable";
    }
}
