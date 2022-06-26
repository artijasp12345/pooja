package com.cybage.genworth.insurance.factory;

import com.cybage.genworth.insurance.exception.PolicyTypeException;
import com.cybage.genworth.insurance.service.InsuranceTypeService;
/**
 * @author Jeevan
 */
public class FactoryLifeGeneralnsurance {

	public static InsuranceTypeService getUserType(String type) {
		// Here type is life or general as per requirements
		if (type == null) {
			return null;
		} else if (type.equalsIgnoreCase("life")) {
			return new LifeInsurance();
		} else if (type.equalsIgnoreCase("general")) {
			return new GeneralInsurance();
		}
		throw new PolicyTypeException("Invalid input");
	}

}
