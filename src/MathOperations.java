import MyExeptions.BigNumber;

public class MathOperations {

    public String mathOperat(String[] mas) {

        boolean arab = new IsValidsLine().isValidLine(mas);
        String result = "";

        if (!arab) {
            mas[0] = RomanNumerals.toInt(mas[0]);
            mas[2] = RomanNumerals.toInt(mas[2]);
        }

        if (Integer.parseInt(mas[0]) > 10 || Integer.parseInt(mas[2]) > 10) {
            try {
                throw new BigNumber();
            } catch (BigNumber bigNumber) {
                bigNumber.printStackTrace();
                System.exit(0);
            }
        }

        switch (mas[1]) {
            case "+": {
                 result = String.valueOf(Integer.parseInt(mas[0]) + Integer.parseInt(mas[2]));
                 break;
            }
            case "-": {
                result = String.valueOf(Integer.parseInt(mas[0]) - Integer.parseInt(mas[2]));
                break;
            }
            case "*": {
                result = String.valueOf(Integer.parseInt(mas[0]) * Integer.parseInt(mas[2]));
                break;
            }
            case "/": {
                result = String.valueOf(Integer.parseInt(mas[0]) / Integer.parseInt(mas[2]));
                break;
            }

        }
        if (arab) {
            return result;
        }else {
            return RomanNumerals.toString(Integer.parseInt(result));
        }
    }
}
