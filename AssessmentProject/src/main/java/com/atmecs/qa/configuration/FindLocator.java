package com.atmecs.qa.configuration;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.qa.helper.CommonUtility;


/**
 * Find locator class
 * @author Mohit.Jaiswal
 *
 */
public class FindLocator {
CommonUtility common = new CommonUtility();

	 Properties homePageProperty;
	 Properties productdetail;

	public FindLocator() {
		try {

			// load the property file home.properties
			homePageProperty= common.propertyFileLoad(FileConstant.findlocator);
		} catch (IOException e) {
			e.getMessage();
		}

		try {

			// load the property file productdeatil.properties
			productdetail= common.propertyFileLoad(FileConstant.productdetail);
		} catch (IOException e) {
			e.getMessage();
		}
	}




	/**
	 * method - getlocator
	 * @param key
	 * @return
	 */
	public  String getlocator(String key)
	{
		String value=homePageProperty.getProperty(key);
		return value;

	}
	/**
	 * method-getproperty
	 * @param key
	 * @return
	 */
	public  String getproperty(String key)
	{
		String value=productdetail.getProperty(key);
		return value;

	}
	



}
