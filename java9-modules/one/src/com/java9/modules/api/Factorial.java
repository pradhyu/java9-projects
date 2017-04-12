package com.java9.modules.api;

import java.math.BigInteger;
import java.util.logging.Logger;

/**
 * Created by PK on 4/11/2017.
 */
public class Factorial {
    private int number=1;
    private static Logger LOGGER =Logger.getLogger("Factorial");

    public Factorial(int number) {
        this.number=number;
    }

    public BigInteger calculate(){
    return calculate(this.number)   ;
    }

    public BigInteger calculate(int number) {
        if (number == 1 || number==0) {
            return BigInteger.ONE;
        } else {
            return calculate(number- 1).multiply(BigInteger.valueOf(number));
        }
    }
}
