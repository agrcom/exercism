import com.google.common.collect.ImmutableMap;

import java.util.Locale;

class ResistorColor {

    private ImmutableMap<String, Integer> resistorColors = ImmutableMap.<String, Integer>builder()
            .put("black", 0)
            .put("brown", 1)
            .put("red", 2)
            .put("orange", 3)
            .put("yellow", 4)
            .put("green", 5)
            .put("blue", 6)
            .put("violet", 7)
            .put("grey", 8)
            .put("white", 9)
            .build();

    int colorCode(String color) {
        String colorToCheck = color.toLowerCase(Locale.getDefault());
        return this.resistorColors.get(colorToCheck);
    }

    String[] colors() {
        return resistorColors.keySet().toArray(new String[0]);
    }
}
