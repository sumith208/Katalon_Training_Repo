package webExDataParser

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
import net.bytebuddy.asm.Advice.Return

public class FlipKartData1 {

	public TestData flipKartData = findTestData(GlobalVariable.FLIPKART)

	public String getSrchEle() {
		return flipKartData.getValue("srchTxt", 1)
	}

	public String getPinCode() {
		return flipKartData.getValue("pincode", 1)
	}

	public String getoption() {
		return flipKartData.getValue("option", 1)
	}
	
	public String model_Name() {
		return flipKartData.getValue("Model_Name", 1)
	}
	
	public String Curr_Name() {
		return flipKartData.getValue("Currency_Name", 1)
	}
}
