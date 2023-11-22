package webExLocator

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

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

public class FlipKartLocators1 {

	public TestObject inputBox() {
		return findTestObject("Object Repository/Flipkart_OR/SrchBox/input_Plus_q")
	}

	public TestObject searchBtn() {
		return findTestObject("Object Repository/Flipkart_OR/srchBtn/img_Newest First__396cs4")
	}

	public TestObject clickProd() {
		return findTestObject("Object Repository/Flipkart_OR/Products/Prd_OR")
	}

	public TestObject clickAddtoCart() {
		return findTestObject("Object Repository/Flipkart_OR/AddtoCart_OR/button_Add to cart")
	}

	public TestObject placeOrderBtn() {
		return findTestObject("Object Repository/Flipkart_OR/Page_Shopping Cart  Flipkart.com/button_Place Order")
	}

	public TestObject enterPinCode() {
		return findTestObject("Object Repository/Flipkart_OR/Enter_Pincode/PinCode_OR")
	}

	public TestObject checkPinCode() {
		return findTestObject("Object Repository/Flipkart_OR/Check_Pincode_OR")
	}

	public TestObject clickFashion() {
		return findTestObject("Object Repository/Flipkart_OR/Fashion")
	}

	public TestObject optionFashion() {
		return findTestObject("Object Repository/Flipkart_OR/fashionOptions")
	}

	public TestObject rating() {
		return findTestObject("Object Repository/Flipkart_OR/Rating")
	}

	public TestObject Valid_Pincode() {
		return findTestObject("Object Repository/Flipkart_OR/Valid_Pincode")
	}
	
	public TestObject click_Shoes() {
		return findTestObject("Object Repository/Flipkart_OR/click_Shoes")
	}
}