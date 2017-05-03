package by.ddv.calculator;

import by.ddv.calculator.arithmetic.Arithmetic;
import by.ddv.calculator.arithmetic.ArithmeticFactory;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.Properties;


public class Calc {

    private String logFileLocation;
    InputStream inputStream = null;
    OutputStream outputStream = null;


    String calculate(BigDecimal arg1, BigDecimal arg2, String operation){

        ArithmeticFactory fact = ArithmeticFactory.getInstance();
        Arithmetic arithmetic = fact.createArithmetic(arg1, arg2, operation);
        arithmetic.execute();
        String res = arithmetic.arithmeticToString();

        loggingOperations(res);

        return res;
    }


    void loggingOperations(String string) {


        Properties property = new Properties();

        try {
            inputStream = getClass().getClassLoader().getResourceAsStream("config.properties");
            if (inputStream == null){
                System.out.println("Sorry, unable to find 'config.properties'");
                logFileLocation = ".//";
            } else {
                property.load(inputStream);
                logFileLocation = property.getProperty("log.file.location");
                if (logFileLocation == null){
                    System.out.println("Sorry, unable to find 'log.file.location'");
                    logFileLocation = ".//";
                }
            }

        } catch (IOException e) {
            logFileLocation = ".//";
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.available();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        File dir = new File(logFileLocation);
        File logFile = new File(dir, "calculator.log");

        try {
            FileUtils.writeStringToFile(logFile, string + "\n", StandardCharsets.UTF_8, true);
        } catch (IOException e) {
            System.out.println("Error: File '" + logFile.getName() + "' could not be created");
        }
    }



}
