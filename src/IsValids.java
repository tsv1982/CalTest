import MyExeptions.BigNumber;
import MyExeptions.IsNotNumber;
import MyExeptions.IsNotOperator;
import MyExeptions.MoreElements;

public class IsValids {

    public String isValid(String mas[]) {

        MathOperations mathOperations = new MathOperations();

        try {

            if (mas.length > 3 || mas.length < 3) {    // больше елементов
                throw new MoreElements();
            }

            if (!Operations.isOperator(mas[1])) {
                throw new IsNotOperator();
            }

            if (mas[0].matches("[-+]?\\d+") && mas[2].matches("[-+]?\\d+")) {
                if (Integer.parseInt(mas[0]) > 10 || Integer.parseInt(mas[2]) > 10) {
                    throw new BigNumber();
                }
                return "result = " + mathOperations.mathOperat(mas);
            } else {
                if (!mas[0].matches("[-+]?\\d+") && !mas[2].matches("[-+]?\\d+")) {
                    mas[0] = RomanNumerals.toInt(mas[0]);
                    mas[2] = RomanNumerals.toInt(mas[2]);
                    if (Integer.parseInt(mas[0]) > 10 || Integer.parseInt(mas[2]) > 10) {
                        throw new BigNumber();
                    }
                    return "result = " + RomanNumerals.toString(mathOperations.mathOperat(mas));
                } else {
                    throw new IsNotNumber();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
