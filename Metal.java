import java.math.BigDecimal;
public abstract class Metal {
    private final String id;
    private final int grade;
    private BigDecimal pricePerGram;
    protected Metal(String id, int grade, BigDecimal price) {
        if (grade <= 0) throw new IllegalArgumentException("Grade must be positive");
        this.id = id; this.grade = grade; setPricePerGram(price);
    }
    public String getId() { return id; }
    public int getGrade() { return grade; }
    public BigDecimal getPricePerGram() { return pricePerGram; }
    public void setPricePerGram(BigDecimal price) {
        if (price == null || price.signum() < 0) throw new IllegalArgumentException("Invalid price");
        pricePerGram = price;
    }
    public abstract String getDescription();
}
