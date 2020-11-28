import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class HandshakeCalculator {

    /*
    1 = wink
10 = double blink
100 = close your eyes
1000 = jump
     */

    private Map<String, Signal> secretSignals = ImmutableMap.of(
            "1", Signal.WINK,
            "10", Signal.DOUBLE_BLINK,
            "100", Signal.CLOSE_YOUR_EYES,
            "1000", Signal.JUMP);

    List<Signal> calculateHandshake(int number) {

        String binaryString = Integer.toBinaryString(number);
        List<String> result = Lists.newArrayList();

        if (number & 1 ^ 1 == 0) result.add("wink");

        return Lists.newArrayList(secretSignals.get(binaryString));
    }

}
