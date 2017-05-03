package by.ddv.calculator;



import java.math.BigDecimal;
import java.util.Arrays;



public class Main {
    public static String log;

    public static void main(String[] args) {


        Calc calc = new Calc();

        if (args.length != 3){
            log = "Error: You entered an incorrect number of arguments, or have lost their";
            System.out.println(log);
            System.exit(0);
        }

        BigDecimal arg0 = creatBigDecimal(args[0]);
        if (arg0 == null) {
            System.exit(0);
        }

        if (!Arrays.asList("+", "-", "x", "/").contains(args[1])){
            log = "Error: Incorrect operator [" + args[1] + "]. Available operators are: +, -, x, /";
            System.out.println(log);
            System.exit(0);
        }

        BigDecimal arg2 = creatBigDecimal(args[2]);
        if (arg2 == null) {
            System.exit(0);
        }


        String result = calc.calculate(arg0, arg2, args[1]);
        System.out.println(result);


    }




    public static BigDecimal creatBigDecimal(String x) {
        try {
            return new BigDecimal(x);
        } catch (NumberFormatException e) {
            log = "Error: Operand [" + x + "] is not a number";
            System.out.println(log);
            return null;
        }
    }









}
