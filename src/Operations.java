public enum Operations {
    I("+"),
    II("-"),
    III("*"),
    IV("/");

    private String value;

    Operations(String value) {
        this.value = value;
    }

    private String getValue() {
        return value;
    }

    static boolean isOperator(String value) {
        for (Operations i : values()) {
            if (i.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }
}
