class LargestSeriesProductCalculator {
    private String number;

    LargestSeriesProductCalculator(String inputNumber) {
        this.number = inputNumber;


        for (char c : this.number.toCharArray()) {
            if (!Character.isDigit(c))
                throw new IllegalArgumentException("String to search may only contain digits.");
        }
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {

        long answer = 0;
        long var = 1;
        int len = this.number.length();
        int num = 0;


        if (numberOfDigits > len)
            throw new IllegalArgumentException(
                "Series length must be less than or equal to the length of the string to search.");


        if (numberOfDigits < 0)
            throw new IllegalArgumentException("Series length must be non-negative.");


        for (int i = 0; i <= (len - numberOfDigits); i++) {
            while (num < numberOfDigits) {
                var *= Character.getNumericValue(this.number.charAt(i + num));
                num++;
            }

            answer = var > answer ? var : answer;
            var = 1;
            num = 0;
        }

        return answer;
    }
}