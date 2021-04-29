package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input) {
        int sum = 0;
        for (char character: input.toCharArray()){
            try {
               int number = Integer.parseInt(String.valueOf(character));
               sum += number;
            } catch (NumberFormatException nfe){
                nfe.printStackTrace();
            }
        }
        return sum;
    }
}
