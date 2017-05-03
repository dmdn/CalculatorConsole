package by.ddv.calculator.arithmetic;


import by.ddv.calculator.Main;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Division extends AbstractArithmetic implements Arithmetic {

    public static String ERROR_DIVISION_BY_ZERO = "Error: You can not divide by ZERO!";

    public Division(BigDecimal operand1, BigDecimal operand2) {
        super(operand1, operand2);
    }

    @Override
    protected BigDecimal execute(BigDecimal op1, BigDecimal op2) {

        if (op2.equals(BigDecimal.ZERO)) {
            //System.out.println(ERROR_DIVISION_BY_ZERO);
            return null;

        } else {

            BigDecimal res = op1.divide(op2, 6, BigDecimal.ROUND_DOWN);

            if (Double.valueOf(res.toString()) % 1 == 0) {
                res = res.setScale(0, RoundingMode.HALF_UP);
            } else {
                res = res.setScale(2, RoundingMode.HALF_UP);
            }

            return res;
        }

    }

    @Override
    public String getOperation() {
        return "/";
    }

    @Override
    public String arithmeticToString() {
        if (getResult() == null) {
            return getOperand1() + " " + getOperation() + " " + getOperand2() + " = " + "!Division by zero!";
        } else {
            return getOperand1() + " " + getOperation() + " " + getOperand2() + " = " + getResult();
        }
    }
}
