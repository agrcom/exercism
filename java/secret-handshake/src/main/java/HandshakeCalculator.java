import com.google.common.collect.Lists;
import java.util.List;

import static java.util.Collections.reverse;

class HandshakeCalculator {
        private static final int doReverse = 16;

        List<Signal> calculateHandshake(int number) {

            List<Signal> result = Lists.newArrayList();

            for (Signal s : Signal.values()) {
                if ((number & s.getCode()) != 0) result.add(s);
            }

            if ((number & doReverse) != 0) reverse(result);
            return result;
        }
}
