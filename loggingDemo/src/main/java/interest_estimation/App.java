package interest_estimation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
public class App {
    private static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger(serialization.App.class);

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double principle , rate;
        int time;
        Logger.info("enter principle :");
        principle = obj.nextDouble();
        Logger.info("rate : ");
        rate = obj.nextDouble();
        Logger.info("time :");
        time = obj.nextInt();

        Interest interest = new Interest(principle,rate,time);
        Logger.info("Simple Interest : "+interest.getSimpleInterest());
        Logger.info("Compound Interest :"+interest.getCompoundInterest());
    }
}