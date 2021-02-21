import java.util.ArrayList;
import java.util.List;

class RaindropConverter {

    private static final Integer THREE = 3;
    private static final Integer FIVE = 5;
    private static final Integer SEVEN = 7;

    public RaindropConverter() {
    }

    String convert(int number) {

        List<Integer> factors = getFactors(number);

        return getRaindropString(number, factors);
    }

    private String getRaindropString(int number, List<Integer> factors) {

        StringBuilder raindrop = new StringBuilder();

        for (Integer factor: factors) {
            if (factor.equals(THREE)) {
                raindrop.append("Pling");
            }

            if (factor.equals(FIVE)) {
                raindrop.append("Plang");
            }

            if (factor.equals(SEVEN)) {
                raindrop.append("Plong");
            }
        }

        if (raindrop.isEmpty()) {
            raindrop.append(number);
        }
        return raindrop.toString();
    }

    private List<Integer> getFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        factors.add(number);

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }
}
