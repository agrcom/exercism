enum Signal {
    WINK(1), DOUBLE_BLINK(2), CLOSE_YOUR_EYES(4), JUMP(8);

    private final int code;

    Signal(int code) {
        this.code = code;
    }

    int getCode() {
        return code;
    }
}
