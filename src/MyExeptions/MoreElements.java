package MyExeptions;

public class MoreElements extends Exception {
    public MoreElements() {
        super("введенно больше елементов или неверный формат ввода /пример -- 1 + 2/");
    }
}
