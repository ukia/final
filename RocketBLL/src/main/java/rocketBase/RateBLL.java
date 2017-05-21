package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		double dInterestRate = 0;
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		
		for (RateDomainModel r: rates)
		{
			if ( r.getiMinCreditScore() <= GivenCreditScore )
			{
				dInterestRate = r.getdInterestRate();
			}
		}
		if (dInterestRate == 0)
		{
			RateDomainModel RDM = new RateDomainModel();
			RDM.setiMinCreditScore(GivenCreditScore);
			throw new RateException(RDM);
		}
		
		
		return dInterestRate;
		
		
	}
	
	
	
	
	
	
	
	
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
