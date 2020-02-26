package com.epam.Logging;

import java.io.*;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	Interest interest = new Interest();
    	String filename = "ResultInterest.ser"; 
    	Scanner read = new Scanner(System.in);
    	logger.info("Enter the pricipal Amount:");
        double principleAmount = read.nextDouble();
        logger.info("\nEnter the duration in years:");
        int time = read.nextInt();
        logger.info("\nEnter the rate of interest:");
        double rate = read.nextDouble();
        logger.info("\nEnter the no of times compounded:");
        int compoundTimes = read.nextInt();
        try
        {    
            FileOutputStream file = new FileOutputStream(filename); 
            ObjectOutputStream out = new ObjectOutputStream(file);  
            out.writeObject(interest);
            logger.info("\nCompoundInterest:"+interest.compoundInterest(principleAmount,time,rate,compoundTimes));
            logger.info("SimpleInterest:"+interest.simpleInterest(principleAmount,time,rate));
            out.close(); 
            file.close(); 
            logger.info("Object has been serialized"); 
  
        }
        catch(IOException ex) 
        { 
            logger.info("IOException is caught"); 
        } 
    }
}

