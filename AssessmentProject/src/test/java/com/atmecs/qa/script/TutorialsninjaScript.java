package com.atmecs.qa.script;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.atmecs.qa.configuration.FindLocator;
import com.atmecs.qa.dataprovider.DataProviderData;
import com.atmecs.qa.dataprovider.ValidatingData;
import com.atmecs.qa.extentreports.ExtentReport;
import com.atmecs.qa.generals.TutorialsninjaPages;
import com.atmecs.qa.helper.CommonUtility;
import com.atmecs.qa.testbase.TestBase;
import com.atmecs.qa.validation.ValidationMethod;
import com.atmecs.qa.waits.Waits;

public class TutorialsninjaScript extends TestBase {

	CommonUtility common = new CommonUtility();
	FindLocator loc = new FindLocator();
	ValidationMethod validate = new ValidationMethod();
	ValidatingData data = new ValidatingData();
	ExtentReport extent = new ExtentReport();
	TutorialsninjaPages method = new TutorialsninjaPages();
   Waits wait= new Waits();
	@Test(priority = 1)
	public void validateHomePage() {
		Logger log = Logger.getLogger(TutorialsninjaScript.class);
		log.info("Step1:Validate HomePage");
		method.homePageValidation(driver);
  
	}

	@Test(priority = 2, dataProvider = "homePage", dataProviderClass = DataProviderData.class)
	public void searchItemMethod(String searchItemMac, String searchItemiphone) {

		Logger log = Logger.getLogger(TutorialsninjaScript.class);
		log.info("Step2: Search for iphone qt.two and  mac qt.3 ");
		common.clickAndSendText(driver, loc.getlocator("Search.item"), 2, searchItemMac);
		// JavascriptExecutor execute = (JavascriptExecutor) driver;
		log.info("click on searchbtn ");
		common.clickElement(driver, loc.getlocator("clicksearchbtn"));


		
		log.info("validating the macbook");
		method.validateProductDetail(driver);
		method.clickAddMac(driver);
		
         
		common.clearElement(driver, loc.getlocator("Search.item"));
		// common.wait(4000);
		log.info("seach for iphone the product");
		common.clickAndSendText(driver, loc.getlocator("Search.item"), 2,searchItemiphone );
		common.clickElement(driver, loc.getlocator("clicksearchbtn"));

		common.scrollToElement(driver, loc.getlocator("scroll"));
		log.info("validate the iphone ");
		method.validatePhone(driver);
		method.clickAddtoCart(driver);
	
		common.wait(4000);
		log.info("click to add to cart");
		common.clickElement(driver, loc.getlocator("AddtoCardBasket.click"));
		common.clickElement(driver, loc.getlocator("viewcart.click"));
		log.info("verify add to cart");
		method.verifyAddToCart(driver);
		common.clearElement(driver, loc.getlocator("removeoneitem"));
		
//		common.clickAndSendText(driver, loc.getlocator("removeoneitem"), 2, data.getValidatingData("changevalue"));
		//common.clickElement(driver, loc.getlocator("update"));
		log.info("verify the grand total updates");
		wait.isElementVisible(driver, loc.getlocator("removeoneitem"));
		method.verifyUpdatedPrice(driver);
		

	}

}