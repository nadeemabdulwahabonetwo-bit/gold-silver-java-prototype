import java.math.BigDecimal;
import java.util.*;
public class GoldSilverPrototype {
    public static void main(String[] args) {
        Map<String, Metal> registry = new LinkedHashMap<>();
        for (int grade : new int[]{9, 18, 21, 24}) register(registry, new Gold(grade, new BigDecimal("0.00")));
        register(registry, new Silver(28, new BigDecimal("0.00")));
        ScoreRule rule = new RandomCombinationRule(1, 25);
        List<ScoreResult> results = new ArrayList<>();
        System.out.println("GOLD AND SILVER DESIGN PROTOTYPE");
        System.out.println("Grades: " + registry.size() + "; prices are placeholders; scores are not coins.");
        for (Metal metal : registry.values()) results.add(rule.calculate(metal, registry.size()));
        for (ScoreResult result : results) result.print();
    }
    private static void register(Map<String, Metal> registry, Metal metal) {
        if (registry.containsKey(metal.getId())) throw new IllegalArgumentException("Duplicate ID");
        registry.put(metal.getId(), metal);
    }
}
