package webEx

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

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
import webExLocator.TripAdvisorsLocator

public class TripAdvisorsAutomate {

	TripAdvisorsLocator locate = new TripAdvisorsLocator();
	//	Keyword
	def openTripAvisors() {
		WebUI.openBrowser(GlobalVariable.TripAdvisorsURL)
		WebUI.maximizeWindow()
	}

	def reviews() {

		WebUI.setText(locate.SrchBar(), 'Club Mahindra')
		WebUI.delay(4)
		WebUI.click(locate.ClubMahindra())
		WebUI.delay(4)
		WebUI.switchToWindowIndex(1)
		WebUI.delay(4)
		WebUI.click(locate.ClickReview())
		WebUI.click(locate.ClickWriteReviews())
		WebUI.mouseOver(locate.MouseHover())
		WebUI.click(locate.ClickRating())
		WebUI.click(locate.slctMnth())
		
	}
}
