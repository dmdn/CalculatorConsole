package by.ddv.calculator.arithmetic;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Addition extends AbstractArithmetic implements Arithmetic {

    public Addition(BigDecimal operand1, BigDecimal operand2) {
        super(operand1, operand2);

    }



    @Override
    protected BigDecimal execute(BigDecimal op1, BigDecimal op2) {
        BigDecimal res = op1.add(op2);

        if (Double.valueOf(res.toString()) % 1 == 0) {
            return  res.setScale(0, RoundingMode.HALF_UP);
        } else {
            return  res.setScale(2, RoundingMode.HALF_UP);
        }
    }

    @Override
    public String getOperation() {
        return "+";
    }

    @Override
    public String arithmeticToString() {
        return getOperand1() + " " + getOperation() + " " + getOperand2() + " = " + getResult();
    }
}
