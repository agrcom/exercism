import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.google.common.base.Preconditions.checkArgument;

class NaturalNumber {

    private final int number;

    public NaturalNumber(int number) {
        checkArgument(number > 0, "You must supply a natural number (positive integer)");
        this.number = number;
    }

    public Classification getClassification() {
        List<Integer> divisors = findDivisors(number);
        Integer aliquotSum = divisors.stream().reduce(0, Integer::sum);

        if (aliquotSum == number) {
            return Classification.PERFECT;
        } else if (aliquotSum > number) {
            return Classification.ABUNDANT;
        } else {
            return Classification.DEFICIENT;
        }
    }

    private List<Integer> findDivisors(int number) {
        return IntStream.range(1, number)
                .boxed()
                .filter(integer -> number % integer == 0)
                .collect(Collectors.toList());
    }
}
