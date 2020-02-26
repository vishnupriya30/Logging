package HouseConstruction;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.Logging.App;

public class costForConstruction {
	int materialType;
	int costPerSquareFeet = 0;
	int totalArea;
	private static Logger logger = LogManager.getLogger(App.class);
	public void readInput(){
		Scanner read = new Scanner(System.in);
		logger.info("Press 1 for 'Standard Materials'\nPress 2 for 'Above Standard Materials'\nPress 3 for High Standard Materials");
		materialType = read.nextInt();
		logger.info("Enter total area of your house");
		totalArea = read.nextInt();
		switch(materialType){
		case 1:
			costPerSquareFeet = 1200;
			break;
		case 2:
			costPerSquareFeet = 1500;
			break;
		case 3:
		    logger.info("Press y if you require automated home else press n:");
			char automatedOption = read.next().charAt(0);
			if(automatedOption == 'n'){
				costPerSquareFeet = 1800;
			}
			else {
				costPerSquareFeet = 2500;
			}
			break;
		default : logger.info("Press a valid option");
		}
	}
	public int totalCost(){
		return costPerSquareFeet*totalArea;
	}

}
