package by.ddv.calculator.arithmetic;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by ddv on 04.04.2017.
 */
public class SubtractionTest {

    Subtraction subtraction = new Subtraction(BigDecimal.valueOf(25), BigDecimal.valueOf(10));

    @Test
    public void execute() throws Exception {
        BigDecimal method = subtraction.execute();
        assertEquals(BigDecimal.valueOf(15), method);

    }

    @Test
    public void getOperation() throws Exception {
        String method = subtraction.getOperation();
        assertEquals("-", method);
    }

}