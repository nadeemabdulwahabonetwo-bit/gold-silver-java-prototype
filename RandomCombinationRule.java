import java.util.concurrent.ThreadLocalRandom;
public class RandomCombinationRule implements ScoreRule {
    private final int minimum, maximumExclusive;
    public RandomCombinationRule(int minimum, int maximumExclusive) {
        if (minimum < 1 || maximumExclusive <= minimum) throw new IllegalArgumentException("Invalid range");
        this.minimum = minimum; this.maximumExclusive = maximumExclusive;
    }
    @Override public ScoreResult calculate(Metal metal, int totalGrades) {
        if (totalGrades < 1) throw new IllegalArgumentException("No registered grades");
        int input = ThreadLocalRandom.current().nextInt(minimum, maximumExclusive);
        int n = Math.max(input, totalGrades), r = Math.min(input, totalGrades);
        return new ScoreResult(metal.getId(), metal.getDescription(), metal.getPricePerGram(), input, n, r, combination(n, r));
    }
    public static long combination(int n, int r) {
        if (n < 0 || r < 0 || r > n) throw new IllegalArgumentException("Requires 0 <= r <= n");
        r = Math.min(r, n - r);
        long result = 1;
        for (int i = 1; i <= r; i++) result = Math.multiplyExact(result, n - r + i) / i;
        return result;
    }
}
