package by.ddv.calculator.arithmetic;

import java.math.BigDecimal;

/** Simple Factory
 * Created by ddv on 06.03.2017.
 */

public class ArithmeticFactory {
    private static ArithmeticFactory instance;

    private ArithmeticFactory() {
    }

    public static ArithmeticFactory getInstance() {
        if(instance == null) {
            instance = new ArithmeticFactory();
        }
        return instance;
    }

    public Arithmetic createArithmetic(BigDecimal arg1, BigDecimal arg2, String operation) {
        Arithmetic arithmeticOperation = null;

        switch (operation) {
            case "+":
                arithmeticOperation = new Addition(arg1, arg2);
                break;
            case "-":
                arithmeticOperation = new Subtraction(arg1, arg2);
                break;
            case "x":
                arithmeticOperation = new Multiplication(arg1, arg2);
                break;
            case "/":
                arithmeticOperation = new Division(arg1, arg2);
                break;
            default: break;
        }

        return arithmeticOperation;

    }


}
