package MyExeptions;

public class BigNumber extends Exception {
    public BigNumber() {
        super("одно из чисел больше 10");
    }
}
