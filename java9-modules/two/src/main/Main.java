package main;

import com.java9.modules.api.Factorial;

import java.util.logging.Logger;

// module two uses the module one
public class Main {
    private static final Logger LOGGER = Logger.getLogger("Main");

    public static void main(String[] args) {
        int number = 1000;
        LOGGER.info("Java9 module two using module one ");
        Factorial fact = new Factorial(number);
        LOGGER.info("Factorial for " + number + " = " + fact.calculate());
    }
}
