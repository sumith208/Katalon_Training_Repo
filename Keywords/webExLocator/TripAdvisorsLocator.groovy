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

public class TripAdvisorsLocator {

	public TestObject ClickReview() {
		return findTestObject("Object Repository/TripAdvisorsLocator/ClickReview")
	}

	public TestObject ClickWriteReviews() {
		return findTestObject("Object Repository/TripAdvisorsLocator/ClickWriteReviews")
	}

	public TestObject SrchBar() {
		return findTestObject("Object Repository/TripAdvisorsLocator/SrchBar")
	}

	public TestObject SrchIcn() {
		return findTestObject("Object Repository/TripAdvisorsLocator/SrchIcn")
	}

	public TestObject ClubMahindra() {
		return findTestObject("Object Repository/TripAdvisorsLocator/ClubMahindra")
	}

	public TestObject MouseHover() {
		return findTestObject("Object Repository/TripAdvisorsLocator/MouseHover")
	}

	public TestObject ClickRating() {
		return findTestObject("Object Repository/TripAdvisorsLocator/ClickRating")
	}
	
	public TestObject slctMnth() {
		return findTestObject("Object Repository/TripAdvisorsLocator/slctMnth")
		
	}

}
