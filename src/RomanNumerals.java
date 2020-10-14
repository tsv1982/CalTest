public enum RomanNumerals {

    I("I", "1"),
    II("II", "2"),
    III("III", "3"),
    IV("IV", "4"),
    V("V", "5"),
    VI("VI", "6"),
    VII("VII", "7"),
    VIII("VIII", "8"),
    IX("IX", "9"),
    X("X", "10"),
    XX("XX", "20"),
    XXX("XXX", "30"),
    XXXX("XXXX", "40"),
    L("L", "50"),
    LX("LX", "60"),
    LXX("LXX", "70"),
    LXXX("LXXX", "80"),
    LXXXX("LXXXX", "90"),
    C("C", "100");

    private String value;
    private String key;

    RomanNumerals(String key, String value) {
        this.value = value;
        this.key = key;
    }

    private String getValue() {
        return value;
    }

    private String getKey() {
        return key;
    }

    static String toInt(String key) {
        for (RomanNumerals i : values()) {
            if (i.getKey().equals(key)) {
                return i.getValue();
            }
        }
        return null;
    }

    private static String toString2(int value) {
        for (RomanNumerals i : values()) {
            if (i.getValue().equals(String.valueOf(value))) {
                return i.getKey();
            }
        }
        return "";
    }

    public static String toString(int value) {
        if (value<=10) {
            return toString2(value);
        }else {
            if(value>10 && value<=20){
                return X.key + toString(value - 10);
            }
            if(value>20 && value<=30){
                return XX.key + toString(value - 20);
            }
            if(value>30 && value<=40){
                return XXX.key + toString(value - 30);
            }
            if(value>40 && value<50){
                return XXXX.key + toString(value - 40);
            }
            if(value == 50){
                return L.key;
            }
            if(value>50 && value<=60){
                return L.key + toString(value - 50);
            }
            if(value>60 && value<=70){
                return LX.key + toString(value - 60);
            }
            if(value>70 && value<=80){
                return LXX.key + toString(value - 70);
            }
            if(value>80 && value<=90){
                return LXXX.key + toString(value - 80);
            }
            if(value>90 && value<100){
                return LXXXX.key + toString(value - 90);
            }
            if(value == 100){
                return C.key;
            }
        }
        return "";
    }
}

