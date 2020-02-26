package com.epam.Logging;

import java.io.Serializable;

public class Interest implements Serializable {

	public Double simpleInterest(double principleAmount, int time, double rate) {
		// TODO Auto-generated method stub
		return (principleAmount*time*rate)/100;
	}

	public Double compoundInterest(double principleAmount, int time, double rate, int compoundTimes) {
		// TODO Auto-generated method stub
		return  principleAmount*(Math.pow((1 + rate/compoundTimes), compoundTimes*time));
	}

}
