package com.atmecs.qa.waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.atmecs.qa.configuration.FileConstant;
import com.atmecs.qa.helper.CommonUtility;

public class Waits {
 
	CommonUtility common = new CommonUtility();
	
	public  boolean isElementVisible(WebDriver driver, String locator) {
		

		WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
		try {
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			wait.until(ExpectedConditions.visibilityOf(common.locatorsType(locator, driver)));
		} catch (Exception exception) {

			return false;
		}
		return true;
	}
	
	

	public  boolean javaScriptThrowsNoExceptions(WebDriver driver, String locator,String  javaScript) {

		WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
		try {
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			wait.until(ExpectedConditions.javaScriptThrowsNoExceptions(javaScript));
		} catch (Exception exception) {

			return false;
		}
		return true;
	}
	
	
	
	
	
	public  boolean elementToBeClickable(WebDriver driver, String locator) {

		WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
		try {
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		//	wait.until(ExpectedConditions.visibilityOf(CommonUtility.locatorsType(locator)));
			wait.until(ExpectedConditions.elementToBeClickable(common.locatorsType(locator, driver)));
		} catch (Exception exception) {

			return false;
		}
		return true;
	}
	


public  boolean stalenessOf(WebDriver driver, String locator) {

	WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
	try {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	//	wait.until(ExpectedConditions.visibilityOf(CommonUtility.locatorsType(locator)));
		wait.until(ExpectedConditions.stalenessOf(common.locatorsType(locator, driver)));
	} catch (Exception exception) {

		return false;
	}
	return true;
}


public  boolean visibilityOfAllElements(WebDriver driver, String locator) {

	WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
	try {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	//	wait.until(ExpectedConditions.visibilityOf(CommonUtility.locatorsType(locator)));
		wait.until(ExpectedConditions.visibilityOfAllElements(common.locatorsType(locator, driver)));
	} catch (Exception exception) {

		return false;
	}
	return true;
}
public  boolean elementToBeSelected(WebDriver driver, String locator) {

	WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
	try {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	//	wait.until(ExpectedConditions.visibilityOf(CommonUtility.locatorsType(locator)));
		wait.until(ExpectedConditions.elementToBeSelected(common.locatorsType(locator, driver)));
	} catch (Exception exception) {

		return false;
	}
	return true;
}

public  boolean alertIsPresent(WebDriver driver, String locator) {

	WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
	try {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	//	wait.until(ExpectedConditions.visibilityOf(CommonUtility.locatorsType(locator)));
		wait.until(ExpectedConditions.alertIsPresent());
	} catch (Exception exception) {

		return false;
	}
	return true;
}


public  boolean titleContains(WebDriver driver, String locator,String title) {

	WebDriverWait wait = new WebDriverWait(driver, FileConstant.Expicit_Wait);
	try {
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	//	wait.until(ExpectedConditions.visibilityOf(CommonUtility.locatorsType(locator)));
		wait.until(ExpectedConditions.titleContains(title));
	} catch (Exception exception) {

		return false;
	}
	return true;
}


public  void wait(int timeOut) {
	try {
		Thread.sleep(timeOut);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}







}







