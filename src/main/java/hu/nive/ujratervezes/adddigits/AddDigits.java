package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input) {
        int sum = 0;
        if (input != null && !input.isEmpty()) {
            for (char character : input.toCharArray()) {
                if (Character.isDigit(character)) {
                    sum += Character.getNumericValue(character);
                }
            }
        } else {
            return -1;
        }
        return sum;
    }
}
