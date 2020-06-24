import com.google.common.math.IntMath;

import java.util.stream.IntStream;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = IntStream.rangeClosed(0, input).sum();
        return IntMath.pow(sum, 2);
    }

    int computeSumOfSquaresTo(int input) {
        return IntStream.rangeClosed(0, input).map(operand -> IntMath.pow(operand, 2)).sum();
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
