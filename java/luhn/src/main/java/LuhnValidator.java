import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Stream;

class LuhnValidator {

    boolean isValid(String candidate) {

        String normalizedCandidate = normalize(candidate);

        if (normalizedCandidate.length() <= 1) {
            return false;
        }

        if (BooleanUtils.isFalse(StringUtils.isNumeric(normalizedCandidate))) {
            return false;
        }

        int[] array = Stream.of(StringUtils.reverse(normalizedCandidate).split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                int doubled = array[i] * 2;
                array[i] = doubled > 9 ? doubled - 9 : doubled;
            }
        }

        return Arrays.stream(array).sum() % 10 == 0;
    }

    private String normalize(String candidate) {
        return StringUtils.replace(candidate, " ", "");
    }
}
