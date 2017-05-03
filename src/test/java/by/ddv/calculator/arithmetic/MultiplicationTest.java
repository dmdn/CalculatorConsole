package by.ddv.calculator.arithmetic;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by ddv on 04.04.2017.
 */
public class MultiplicationTest {

    Multiplication multiplication = new Multiplication(BigDecimal.valueOf(2.5), BigDecimal.valueOf(10));

    //Multiplication multiplication = new Multiplication(BigDecimal.valueOf(2.55), BigDecimal.valueOf(10));


    @Test
    public void execute() throws Exception {
        BigDecimal method = multiplication.execute();
        assertEquals(BigDecimal.valueOf(25), method);

        //assertEquals(0, result.compareTo(BigDecimal.valueOf(25.50000)));

    }

    @Test
    public void getOperation() throws Exception {
        String method = multiplication.getOperation();
        assertEquals("x", method);

    }

}