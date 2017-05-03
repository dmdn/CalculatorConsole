package by.ddv.calculator.arithmetic;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created by ddv on 04.04.2017.
 */
public class DivisionTest {

    Division division = new Division(BigDecimal.valueOf(25), BigDecimal.valueOf(0));

    @Test
    public void execute() throws Exception {
        BigDecimal method = division.execute();
        assertEquals(null, method);
    }

    @Test
    public void getOperation() throws Exception {
        String method = division.getOperation();
        assertEquals("/", method);
    }

}