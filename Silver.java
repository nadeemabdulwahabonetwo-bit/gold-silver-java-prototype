import java.math.BigDecimal;
public class Silver extends Metal {
    public Silver(int grade, BigDecimal price) { super("SILVER-CUSTOM-" + grade, grade, price); }
    @Override public String getDescription() { return "Silver " + getGrade() + " custom design units"; }
}
