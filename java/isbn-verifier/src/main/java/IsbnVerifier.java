import org.apache.commons.lang3.StringUtils;

class IsbnVerifier {

    private static final int ISBN_10_DIGITS = 10;

    boolean isValid(String stringToVerify) {
        String removedHyphens = StringUtils.remove(stringToVerify, "-");

        if (removedHyphens.length() != ISBN_10_DIGITS || !StringUtils.isNumeric(StringUtils.removeEnd(removedHyphens, "X"))) {
            return false;
        }

        int amount = 0;
        for (int i = ISBN_10_DIGITS; i > 0; i--) {
            if (Character.toString(removedHyphens.charAt(ISBN_10_DIGITS - i)).equals("X")) {
                amount += 10 * i;
            } else
                amount += Character.getNumericValue(removedHyphens.charAt(ISBN_10_DIGITS - i)) * i;
        }

        return amount % 11 == 0;
    }
}
