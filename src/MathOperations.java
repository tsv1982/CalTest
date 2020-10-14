public class MathOperations {

    public int mathOperat(String[] mas) {
        switch (mas[1]) {
            case "+": {
                return Integer.parseInt(mas[0]) + Integer.parseInt(mas[2]);
            }
            case "-": {
                return Integer.parseInt(mas[0]) - Integer.parseInt(mas[2]);
            }
            case "*": {
                return Integer.parseInt(mas[0]) * Integer.parseInt(mas[2]);
            }
            case "/": {
                return Integer.parseInt(mas[0]) / Integer.parseInt(mas[2]);
            }
            default: {
                return 0;
            }
        }
    }
}
