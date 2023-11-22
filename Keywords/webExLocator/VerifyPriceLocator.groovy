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

public class VerifyPriceLocator {

	public TestObject srchBx() {
		return findTestObject("Object Repository/VerifyPrices_OR/flipkrt_SrchBx")
	}

	public TestObject SrchIcn() {
		return findTestObject("Object Repository/VerifyPrices_OR/SrchIcn")
	}

	public TestObject clickProd() {
		return findTestObject("Object Repository/VerifyPrices_OR/clickProd")
	}

	public TestObject Prod_Color() {
		return findTestObject("Object Repository/VerifyPrices_OR/Prod_Color")
	}

	public TestObject Click_Storage() {
		return findTestObject("	Object Repository/VerifyPrices_OR/Click_Storage")
	}

	public TestObject Click_RAM() {
		return findTestObject("	Object Repository/VerifyPrices_OR/Click_RAM")
	}

	public TestObject Set_Pincode() {
		return findTestObject("Object Repository/VerifyPrices_OR/Set_Pincode")
	}

	public TestObject Click_Chck() {
		return findTestObject("	Object Repository/VerifyPrices_OR/Click_Chck")
	}

	public TestObject Validate_Pincode() {
		return findTestObject("Object Repository/VerifyPrices_OR/Validate_Pincode")
	}

	public TestObject FlipkrtPrice() {
		return findTestObject("Object Repository/VerifyPrices_OR/FlipkrtPrice")
	}

	public TestObject AmzSrchBx() {
		return findTestObject("Object Repository/VerifyAmzPrice/AmzSrchBx")
	}
	public TestObject Click_Curr() {
		return findTestObject("Object Repository/VerifyAmzPrice/Click_Curr")
	}

	public TestObject Curr_Option() {
		return findTestObject("Object Repository/VerifyAmzPrice/Curr_Option")
	}

	public TestObject click_Option() {
		return findTestObject("Object Repository/VerifyAmzPrice/click_Option")
	}

	public TestObject Save_Cuur() {
		return findTestObject("Object Repository/VerifyAmzPrice/Save_Cuur")
	}

	public TestObject Click_SrchIcn() {
		return findTestObject("Object Repository/VerifyAmzPrice/Click_SrchIcn")
	}

	public TestObject Click_Prod1() {
		return findTestObject("Object Repository/VerifyAmzPrice/Click_Prod")
	}

	public TestObject Element() {
		return findTestObject("Object Repository/VerifyAmzPrice/Element")
	}
}
