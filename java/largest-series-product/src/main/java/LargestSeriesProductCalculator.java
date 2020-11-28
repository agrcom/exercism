import org.apache.commons.lang3.StringUtils;

import java.util.stream.Stream;

class LargestSeriesProductCalculator {
    private static int[] numbers;

    LargestSeriesProductCalculator(String inputNumber) {
        if(!inputNumber.isEmpty() && !StringUtils.isNumeric(inputNumber)){
            throw new IllegalArgumentException("String to search may only contain digits.");
        }


        char[] charArray = inputNumber.toCharArray();
        String[] strings = new String[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            strings[i] = String.valueOf(charArray[i]);
        }

        numbers = Stream.of(strings)
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if (numberOfDigits > numbers.length) {
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }

        int largest = 0;
        for (int i = 0; i < (numbers.length + 1) - (numberOfDigits); i++) {
            int tmp = 0;

            for (int j = i; j < numberOfDigits + i; j++) {
                if (tmp == 0) tmp = numbers[j];
                else
                    tmp *= numbers[j];
            }

            if (tmp > largest) {
                largest = tmp;
            }
        }
        return largest;
    }
}
