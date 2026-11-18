import java.math.BigDecimal;
public class Gold extends Metal {
    public Gold(int carat, BigDecimal price) {
        super("GOLD-" + carat, carat, price);
        if (carat > 24) throw new IllegalArgumentException("Gold carat must not exceed 24");
    }
    @Override public String getDescription() { return "Gold " + getGrade() + " carat"; }
}
