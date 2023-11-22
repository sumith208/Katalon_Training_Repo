package webEx

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.rmi.registry.LocateRegistry

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

import internal.GlobalVariable
import webExDataParser.FlipKartData1
import webExLocator.FlipKartLocators1

public class FlipKartAutomate {

	FlipKartLocators1 locate = new FlipKartLocators1()
	FlipKartData1 parse = new FlipKartData1()


	def boolean openBrowser() {
		WebUI.openBrowser(GlobalVariable.URL)
		WebUI.maximizeWindow()
		WebUI.setText(locate.inputBox(),parse.getSrchEle() )
		WebUI.click(locate.searchBtn())
		WebUI.click(locate.clickProd())
		WebUI.delay(2)
		WebUI.switchToWindowIndex(1)
		WebUI.waitForElementPresent(locate.enterPinCode(), 2)
		WebUI.setText(locate.enterPinCode(), parse.getPinCode())
		WebUI.click(locate.checkPinCode())
		WebUI.waitForElementPresent(locate.clickAddtoCart(), 2)
		WebUI.click(locate.clickAddtoCart())

		return WebUI.verifyElementPresent(locate.placeOrderBtn(), 4)
	}
}
