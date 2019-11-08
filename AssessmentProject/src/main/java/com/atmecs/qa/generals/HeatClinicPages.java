package com.atmecs.qa.generals;

import org.openqa.selenium.WebDriver;

import com.atmecs.qa.configuration.FindLocator;
import com.atmecs.qa.dataprovider.ValidatingData;
import com.atmecs.qa.extentreports.ExtentReport;
import com.atmecs.qa.helper.CommonUtility;
import com.atmecs.qa.validation.ValidationMethod;

public class HeatClinicPages {
	CommonUtility common = new CommonUtility();
	FindLocator loc = new FindLocator();
	ValidationMethod validate = new ValidationMethod();
	ValidatingData data = new ValidatingData();
	ExtentReport extent = new ExtentReport();
	int index=1;
public void clickMenu(WebDriver driver)
{

	
	
	 
		// for(int i=1;i<=8;i++)
		// Common.clickElement(driver, loc.getlocator("Clicklink").replace("***", index+""));
	 common.clickElement(driver, loc.getproperty("click.menu").replace("***",index+"" ));
		 index++;
		 
	 }
		
public void getTitleAndVerify(WebDriver driver,String expected_Title)	 {
	String actualTitle = driver.getTitle();
	validate.verify(actualTitle,expected_Title , "not matched");
	
}
	 
	 
public void verifyViewing(WebDriver driver, String displayed_message)
{
	String actual_text= common.getText(driver, loc.getproperty("text.veiwing"));
	System.out.println(actual_text);
	validate.verify(actual_text, displayed_message, "not matched");
	System.out.println(displayed_message);
	
}

public void validateAddToCart(WebDriver driver,String productname,String size,String personalname,String color,String price,String totalPrice)
{
	System.out.println(productname);
System.out.println(size);
System.out.println(personalname);
System.out.println(color);

	common.wait(1000);
	
	String actual_productname=common.getText(driver, loc.getproperty("getproductname"));
	System.out.println(actual_productname);
	validate.verify(actual_productname, productname, "not matched");
	
	String actual_size=common.getText(driver, loc.getproperty("getsize"));
	
	validate.verify(actual_size, size, "not matched");
	String actual_personalname=common.getText(driver, loc.getproperty("getpersonal"));
System.out.println(actual_personalname);
	//validate.verify(actual_personalname, personalname, "not matched");
	validate.verify(actual_personalname, personalname, "not matched");
	String actual_color=common.getText(driver, loc.getproperty("getcolor"));
	System.out.println(actual_color);
	//validate.verify(actual_productname, color, "not matched");
	validate.verify(actual_productname, color, "not matched");
	
	String actual_price=common.getText(driver, loc.getproperty("getprice"));
	validate.verify(actual_price, price, "not matched");
	String actual_totalprice=common.getText(driver, loc.getproperty("gettotalprice"));
	validate.verify(actual_totalprice, totalPrice, "not matched");
	
	
}
public void validateUpdatedPrice(WebDriver driver,String updatedprice)
{
	String actualupdate=common.getText(driver, loc.getproperty("getupdatedtotal"));
	validate.verify(actualupdate, updatedprice, "not matched");
	
}


	
}

