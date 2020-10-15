import MyExeptions.IsNotValidNumder;
import MyExeptions.IsNotValidOperator;
import MyExeptions.IsValidRimNumber;
import MyExeptions.MoreElements;

public class IsValidsLine {
    public boolean isValidLine(String mas[]) {
        boolean arab = false;

        try {

            if (mas.length > 3 || mas.length < 3) {
                throw new MoreElements();
            }

            if (!Operations.isOperator(mas[1])) {
                throw new IsNotValidOperator();
            }

            if (mas[0].matches("[-+]?\\d+")) {
                arab = true;
            } else {
                arab = false;
            }

            if (arab) {
                if (mas[2].matches("[-+]?\\d+") && arab) {
                    return arab;
                } else {
                    throw new IsNotValidNumder();
                }
            } else {
                if (!mas[2].matches("[-+]?\\d+") && !arab) {
                    try {
                        RomanNumerals.valueOf(mas[0]);
                        RomanNumerals.valueOf(mas[2]);
                    } catch (IllegalArgumentException e) {
                        throw new IsValidRimNumber();
                    }
                } else {
                    throw new IsNotValidNumder();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

        return arab;
    }
}
