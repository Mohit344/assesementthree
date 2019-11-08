package com.atmecs.qa.generals;

import org.openqa.selenium.WebDriver;

import com.atmecs.qa.configuration.FindLocator;
import com.atmecs.qa.dataprovider.ValidatingData;
import com.atmecs.qa.extentreports.ExtentReport;
import com.atmecs.qa.helper.CommonUtility;
import com.atmecs.qa.validation.ValidationMethod;

public class TutorialsninjaPages {


	CommonUtility common = new CommonUtility();
	FindLocator loc = new FindLocator();
	ValidationMethod validate = new ValidationMethod();
	ValidatingData data = new ValidatingData();
	ExtentReport extent = new ExtentReport();
	
public void homePageValidation(WebDriver driver) {
	String actualTitle = driver.getTitle();
	validate.verify(actualTitle, data.getValidatingData("expectedTitle"), "Title not matched");
	
	
}

public void validateProductDetail(WebDriver driver)
{
  String actual_Available=common.getText(driver, loc.getlocator("Available"));
  System.out.println(actual_Available);
  validate.verify(actual_Available, data.getValidatingData("MacAvailableitem"), "not matched");
  String actual_Description=common.getText(driver, loc.getlocator("Description"));
 System.out.println(actual_Description);
  validate.verify(actual_Description, data.getValidatingData("MacDescription"), "not matched");
  String actual_Price_Taxes= common.getText(driver, loc.getlocator("priceandtaxes"));
  System.out.println(actual_Price_Taxes);
  validate.verify(actual_Price_Taxes, data.getValidatingData("validate_priceandtaxes"), "not matched");
}
	

public void validatePhone(WebDriver driver)
{
	String actual_Available=common.getText(driver, loc.getlocator("iphoneAvaliable"));
	  System.out.println(actual_Available);
	  validate.verify(actual_Available, data.getValidatingData("iavail"), "not matched");
	  String actual_Description=common.getText(driver, loc.getlocator("iphoneDesscription"));
	 System.out.println(actual_Description);
	  validate.verify(actual_Description, data.getValidatingData("idescription"), "not matched");
	  String actual_Price_Taxes= common.getText(driver, loc.getlocator("iTaxes"));
	  System.out.println(actual_Price_Taxes);
	  validate.verify(actual_Price_Taxes, data.getValidatingData("Taxes"), "not matched");
	}
	





public void clickAddtoCart(WebDriver driver)
{
	for(int index=1;index<=2;index++)
	{
		
		common.clickElement(driver, loc.getlocator("AddtoCart"));
	}
	
	
}

public void clickAddMac(WebDriver driver)
{
	for(int index=1;index<=3;index++)
	{
		
		common.clickElement(driver, loc.getlocator("AddtoCart"));
	}
	
	
}

public void verifyAddToCart(WebDriver driver)
{
	String actual_Available1=	common.getText(driver, loc.getlocator("verifycartiphone"));
	validate.verify(actual_Available1, data.getValidatingData("iavail"), "not matched");
	String actual_Available2= common.getText(driver, loc.getlocator("verifycartmac"));
	validate.verify(actual_Available1, data.getValidatingData("MacAvailableitem"), "not matched");
	String grandTotal=common.getText(driver, loc.getlocator("grandTotal"));
	validate.verify(grandTotal, data.getValidatingData("grandPrice"), "not matched");

}


public void verifyUpdatedPrice(WebDriver driver)
{
	
String actual_grandprice=	common.getText(driver, loc.getlocator("updatedprice"));
System.out.println(actual_grandprice);
	validate.verify(actual_grandprice, data.getValidatingData("updatedgrandpriceupdated"), "not matched");
}
	
}
