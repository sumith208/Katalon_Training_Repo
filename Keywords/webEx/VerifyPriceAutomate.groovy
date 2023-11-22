package webEx

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.RenderingHints.Key
import java.awt.event.KeyEvent
import java.util.concurrent.ConcurrentHashMap.KeySetView

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.webui.driver.DriverFactory
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import webExDataParser.FlipKartData1
import webExLocator.VerifyPriceLocator

public class VerifyPriceAutomate {

	VerifyPriceLocator locate = new VerifyPriceLocator();
	FlipKartData1 data = new FlipKartData1();
	int FlipKartPrice ;
	int AmazonPrice;

	def openFlipKart() {
		WebUI.openBrowser('https://www.flipkart.com/')
		WebUI.maximizeWindow()
		WebUI.sendKeys(locate.srchBx(), data.model_Name())
		WebUI.click(locate.SrchIcn())
		WebUI.click(locate.clickProd())
		WebUI.switchToWindowIndex(1)
		//		WebUI.click(locate.Prod_Color())
		//		WebUI.setText(locate.Click_RAM(), "576221")
		//		WebUI.click(locate.Click_RAM())
		//		WebUI.setText(locate.Set_Pincode(), "576221")
		//		WebUI.verifyElementText(locate.Validate_Pincode(), "Delivery in")
		String price = WebUI.getText(locate.FlipkrtPrice())
		//		String inputString = "₹61,990";

		// Remove non-numeric characters
		String numericString = price.replaceAll("[^\\d]", "");

		try {
			// Parse the numeric string into an integer
			FlipKartPrice = Integer.parseInt(numericString);

			// Print the result
			System.out.println("FlipKart Price: " + FlipKartPrice);
		} catch (NumberFormatException e) {
			// Handle the case where the string does not represent a valid integer
			System.out.println("Error: Unable to convert the string to an integer.");
		}


		//		println(FlipKartPrice)
	}

	def openAmazon() {
		WebUI.openBrowser('https://www.amazon.com/')
		WebUI.click(locate.Click_Curr())
		WebUI.click(locate.click_Option())
		List<WebElement> ele = WebUI.findWebElements(locate.Curr_Option(), 4)
		for(WebElement opt : ele) {
			if(opt.getText().equals(data.Curr_Name())) {
				//			   	println(opt.getText())
				opt.click()
				break
			}
		}
		WebUI.click(locate.Save_Cuur())

		//		WebUI.verifyElementPresent(findTestObject('Object Repository/VerifyAmzPrice/Element'),3)
		WebUI.setText(locate.AmzSrchBx(), data.model_Name())

		WebUI.click(locate.Click_SrchIcn())
		WebUI.click(locate.Click_Prod1())

		String AmzPrice = WebUI.getText(locate.Element())
		String numericString1 = AmzPrice.replaceAll("[^\\d]", "");

		try {
			// Parse the numeric string into an integer
			AmazonPrice = Integer.parseInt(numericString1);

			// Print the result
			System.out.println("Amazon Price: " + AmazonPrice);
		} catch (NumberFormatException e) {
			// Handle the case where the string does not represent a valid integer
			System.out.println("Error: Unable to convert the string to an integer.");
		}

		if(FlipKartPrice>AmazonPrice) {
			println("Price in Amazon lesser compare to Flipkart")
		}
		else {
			println("Price in FlipKart lesser compare to Amazon")
		}
	}
}
