package by.ddv.calculator.arithmetic;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by ddv on 04.04.2017.
 */
public class AdditionTest {

    Addition addition = new Addition(BigDecimal.valueOf(15), BigDecimal.valueOf(10));

    @Test
    public void execute() throws Exception {
        BigDecimal method = addition.execute();
        assertEquals(BigDecimal.valueOf(25), method);
    }

    @Test
    public void getOperation() throws Exception {
        String method = addition.getOperation();
        assertEquals("+", method);
    }

}