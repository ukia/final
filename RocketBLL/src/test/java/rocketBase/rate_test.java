package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	//TODO - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	public void rateTest() throws RateException{
		int iCreditScore = 611;
		
			double dInterestRate = RateBLL.getRate(iCreditScore);
			assertEquals(7,dInterestRate,0.01);
		}
	
}
