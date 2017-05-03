package by.ddv.calculator.arithmetic;
import java.math.BigDecimal;


public abstract class AbstractArithmetic implements Arithmetic{
    private BigDecimal operand1, operand2, result;

    public AbstractArithmetic(BigDecimal operand1, BigDecimal operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public BigDecimal getOperand1(){
        return operand1;
    }

    public BigDecimal getOperand2(){
        return operand2;
    }

    public BigDecimal getResult(){
        return result;
    }

    public BigDecimal execute(){
        return result = execute(operand1, operand2);
    }

    protected abstract BigDecimal execute(BigDecimal operand1, BigDecimal operand2);


    public abstract String getOperation();



}
