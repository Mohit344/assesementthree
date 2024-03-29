package com.atmecs.qa.script;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecs.qa.configuration.FindLocator;
import com.atmecs.qa.dataprovider.DataProviderData;
import com.atmecs.qa.dataprovider.ValidatingData;
import com.atmecs.qa.extentreports.ExtentReport;
import com.atmecs.qa.generals.HeatClinicPages;
import com.atmecs.qa.helper.CommonUtility;
import com.atmecs.qa.testbase.TestBase;
import com.atmecs.qa.validation.ValidationMethod;
import com.atmecs.qa.waits.Waits;

public class HeatClinicScript extends TestBase {
	
	
	CommonUtility common = new CommonUtility();
	FindLocator loc = new FindLocator();
	ValidationMethod validate = new ValidationMethod();
	ValidatingData data = new ValidatingData();
	ExtentReport extent = new ExtentReport();
	HeatClinicPages methods = new HeatClinicPages();
	Waits time= new Waits();
@Test(priority = 1, dataProvider = "title", dataProviderClass = DataProviderData.class)	
/**
 * methodsname-clickMenuVerify
 * @param expected_Title
 */
public void clickMenuVerify(String expected_Title)
{
	Logger log = Logger.getLogger(TutorialsninjaScript.class);
	log.info("click all menu and validate redirection");
	methods.clickMenu(driver);
	methods.getTitleAndVerify(driver, expected_Title);
	
	
}
@Test(priority = 2, dataProvider = "product", dataProviderClass = DataProviderData.class)
/**
 * methodname-clickMerchantVerifyProduct
 * @param displayed_message
 * @param personNameinput
 * @param productname
 * @param size
 * @param personalname
 * @param color
 * @param price
 * @param totalPrice
 * @param addmoreQT
 * @param updatedprice
 */
public void clickMerchantVerifyProduct( String displayed_message,String personNameinput,String productname,String size,String personalname,String color,String price,String totalPrice,String addmoreQT,String updatedprice)
{ 
	
	
	Logger log = Logger.getLogger(TutorialsninjaScript.class);
     log.info("click on merchandise");
	//common.clickElement(driver, loc.getproperty("click.merchant"));
     common.mouseHover(loc.getproperty("click.merchant"), driver);
     common.clickElement(driver, loc.getproperty("MOuseHover"));
	methods.verifyViewing(driver, displayed_message);
	log.info("select the tshrit color size ");
	common.clickElement(driver, loc.getproperty("clickonmenTshirt"));
	common.clickElement(driver, loc.getproperty("clickredColor"));
	common.wait(1000);
//	time.isElementVisible(driver, loc.getproperty("clickondsizeM"));
	driver.switchTo().alert().accept();
	common.clickElement(driver, loc.getproperty("clickondsizeM"));
	common.wait(1000);
 //   time.isElementVisible(driver, loc.getproperty("personalname"));
	log.info("handle popup");
	driver.switchTo().alert().accept();
	log.info("enter the personal name");
	common.clickAndSendText(driver, loc.getproperty("personalname"), 2, personNameinput);
    
	
	common.clickElement(driver, loc.getproperty("click.BuyNow"));
	common.clickElement(driver, loc.getproperty("click.addtocart"));
	common.wait(4000);
	log.info("add qt.");
	methods.validateAddToCart(driver, productname, size, personalname, color, price, totalPrice);
//	common.clearElement(driver, loc.getproperty("addQuantity"));
	common.clickAndSendText(driver, loc.getproperty("addQuantity"), 2, addmoreQT);
//common.mouseHover(loc.getproperty("addQuantity"), driver);
//common.clickElement(driver, loc.getlocator("addQuantity"));
	
	common.wait(2000);
	log.info("click updaate");
	common.clickElement(driver, loc.getproperty("clickUpdate"));

	
	methods.validateUpdatedPrice(driver, updatedprice);
    //common.wait(2000);
}


}
