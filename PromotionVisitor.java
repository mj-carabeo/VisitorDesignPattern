public abstract class PromotionVisitor {
  public abstract String visit(Smart smart);
  public abstract String visit(Globe globe);
  public abstract String visit(Ditto ditto);
}

public class UsagePromoVisitor extends PromotionVisitor {
  @Override
  public String visit(Smart smart) {
    return new UsagePromo().showAllowance(smart.getTelcoName(), smart.getPromoPrice());
  }

  @Override
  public String visit(Globe globe) {
    return new UsagePromo().showAllowance(globe.getTelcoName(), globe.getPromoPrice());
  }

  @Override
  public String visit(Ditto ditto) {
    return new UsagePromo().showAllowance(ditto.getTelcoName(), ditto.getPromoPrice());
  }
}

public class UnliCallTextPromoVisitor extends PromotionVisitor {
  @Override
  public String visit(Smart smart) {
    return new UnliCallOffer().showUnliCallsTextOffer(smart.getTelcoName(), smart.getUnliCallText());
  }

  @Override
  public String visit(Globe globe) {
    return new UnliCallOffer().showUnliCallsTextOffer(globe.getTelcoName(), globe.getUnliCallText());
  }

  @Override
  public String visit(Ditto ditto) {
