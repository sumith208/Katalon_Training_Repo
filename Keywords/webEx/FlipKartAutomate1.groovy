package webEx

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.awt.geom.Arc2D.Double

import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import webExDataParser.FlipKartData1
import webExLocator.FlipKartLocators1

public class FlipKartAutomate1 {

	FlipKartLocators1 locate = new FlipKartLocators1()
	FlipKartData1 data = new FlipKartData1()

	def openFlipKart() {
		WebUI.openBrowser('https://www.flipkart.com/')
		WebUI.click(locate.clickFashion())
		List<WebElement> option = WebUI.findWebElements(locate.optionFashion(), 4)

		for(WebElement ele : option) {
			if(ele.getText().equals(data.getoption())) {
				ele.click();
				break;
			}
		}
		WebUI.click(locate.click_Shoes())
		WebUI.delay(2)
		WebUI.switchToWindowIndex(1)
		String str = WebUI.getText(locate.rating())

		Double rate  = (Double) java.lang.Double.parseDouble(str)



		if(rate>=4) {
			WebUI.setText(locate.enterPinCode(), data.getPinCode())()
			WebUI.click(locate.checkPinCode())
			WebUI.verifyElementText(locate.Valid_Pincode(), 'Delivery by')
		}
		else {
			KeywordUtil.markError("Failed")
		}
	}
}
