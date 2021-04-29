package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if(input == null || input.isEmpty()){
            return -1;
        }

        int sum = 0;
        for (char character : input.toCharArray()) {
            if (Character.isDigit(character)) {
                sum += Character.getNumericValue(character);
            }
        }

        return sum;
    }
}
