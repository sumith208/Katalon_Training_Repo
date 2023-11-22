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
import net.bytebuddy.asm.Advice.Return

public class MakeMyTripLocator {

	public TestObject rndTripChckBox() {
		return findTestObject("Object Repository/MakeMyTrip_OR/ChckBox_OR")
	}

	public TestObject frmLocation() {
		return findTestObject("Object Repository/MakeMyTrip_OR/From")
	}

	public TestObject frmTxt() {
		return findTestObject("Object Repository/MakeMyTrip_OR/FromTxt")
	}

	public TestObject toTxt() {
		return findTestObject("Object Repository/MakeMyTrip_OR/ToTxT")
	}


	public TestObject clicktoLocation() {
		return findTestObject("Object Repository/MakeMyTrip_OR/clickToLocation")
	}

	public TestObject setTextTo() {
		return findTestObject("Object Repository/MakeMyTrip_OR/setTextTo")
	}

	public TestObject clickFromLocation() {
		return findTestObject("Object Repository/MakeMyTrip_OR/clickFromLocation")
	}

	public TestObject clickDept() {
		return findTestObject("Object Repository/MakeMyTrip_OR/Dept_Click")
	}

	public TestObject setReturn() {
		return findTestObject("Object Repository/MakeMyTrip_OR/setReturn")
	}

	public TestObject NxtMnth() {
		return findTestObject("Object Repository/MakeMyTrip_OR/NxtMnth")
	}

	public TestObject Dates() {
		return findTestObject("Object Repository/MakeMyTrip_OR/Dates")
	}

	public TestObject getDate() {
		return findTestObject("Object Repository/MakeMyTrip_OR/getDate")
	}

	public TestObject lstLoc() {
		return findTestObject("Object Repository/MakeMyTrip_OR/lstLoc")
	}

	public TestObject Ret_Click() {
		return findTestObject("Object Repository/MakeMyTrip_OR/Ret_Click")
	}

	public TestObject TravelClassClick() {
		return findTestObject("Object Repository/MakeMyTrip_OR/TravelClassClick")
	}

	public TestObject lstAge() {
		return findTestObject("Object Repository/MakeMyTrip_OR/lstAge")
	}

	public TestObject clickSeats() {
		return findTestObject("Object Repository/MakeMyTrip_OR/clickSeats")
	}

	public TestObject clickBusiness() {
		return findTestObject("Object Repository/MakeMyTrip_OR/clickBusiness")
	}

	public TestObject apply() {
		return findTestObject("Object Repository/MakeMyTrip_OR/Apply")
	}

	public TestObject srchBtn() {
		return findTestObject("Object Repository/MakeMyTrip_OR/srchBtn")
	}

	public TestObject Book_Now() {
		return findTestObject("Object Repository/MakeMyTrip_OR/Book_Now")
	}
}
