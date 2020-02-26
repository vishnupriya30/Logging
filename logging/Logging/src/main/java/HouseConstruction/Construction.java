package HouseConstruction;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Construction {
	private static Logger logger = LogManager.getLogger(Construction.class);
	public static void main(String[] args) {
	    costForConstruction cost = new costForConstruction();
	    cost.readInput();
		logger.info("\nTotal Cost of Construction:"+cost.totalCost()+"INR");
		
		// TODO Auto-generated method stub

	}

}
