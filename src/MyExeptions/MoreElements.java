package MyExeptions;

public class MoreElements extends Exception {
    public MoreElements() {
        super("введено больше элементов или неверный формат ввода пример /1 + 2/,  /I + II/");
    }
}
