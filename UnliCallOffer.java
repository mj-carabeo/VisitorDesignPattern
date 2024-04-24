public class UnliCallOffer implements Promotion {
    @Override
    public String showAllowance(String telcoName, int promoPrice) {
        return telcoName + " unlimited calls and text package: Not applicable";
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + " unlimited calls and text package: " + (unliCallText ? "Available" : "Not Available");
    }
}
