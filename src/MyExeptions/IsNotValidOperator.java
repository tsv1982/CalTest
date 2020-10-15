package MyExeptions;

public class IsNotValidOperator extends Exception {
    public IsNotValidOperator() {
        super("не правельный оператор '*' '/' '-' '+'");
    }
}
