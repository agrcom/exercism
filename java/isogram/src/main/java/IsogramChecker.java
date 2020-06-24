import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        if (phrase.isEmpty()) {
            return true;
        }
        phrase = StringUtils.remove(phrase, "-");
        phrase = StringUtils.deleteWhitespace(phrase);


        char[] chars = phrase.toLowerCase().trim().toCharArray();
        Set<String> unique = new HashSet<>();

        for (char ch : chars) {
            unique.add(String.valueOf(ch));
        }

        return chars.length == unique.size();
    }

}
