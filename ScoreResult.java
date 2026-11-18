import java.math.BigDecimal;
public class ScoreResult {
    private final String metalId, description;
    private final BigDecimal pricePerGram;
    private final int randomInput, n, r;
    private final long score;
    public ScoreResult(String id, String description, BigDecimal price, int input, int n, int r, long score) {
        this.metalId = id; this.description = description; this.pricePerGram = price;
        this.randomInput = input; this.n = n; this.r = r; this.score = score;
    }
    public long getScore() { return score; }
    public void print() {
        System.out.println("\nID: " + metalId);
        System.out.println("Metal: " + description);
        System.out.println("Price per gram (placeholder): " + pricePerGram.toPlainString());
        System.out.println("Random input: " + randomInput);
        System.out.println("Calculation: C(" + n + ", " + r + ")");
        System.out.println("Combination score: " + score);
    }
}
