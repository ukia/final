package exceptions;

import rocketDomain.RateDomainModel;

public class RateException extends Exception {
	
	
	private RateDomainModel RateModel;

	public RateException(RateDomainModel rateModel) {
		super();
		RateModel = rateModel;
	}

	public RateDomainModel getRDM() {
		return RateModel;
	}
	
	
	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
}
