package webEx

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.xml.ws.WebEndpoint

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
import com.thoughtworks.selenium.webdriven.commands.Click

import internal.GlobalVariable
import webExLocator.MakeMyTripLocator

public class MakeMyTripAutomate {

	MakeMyTripLocator locate1 = new MakeMyTripLocator()
	def openBrowser() {
		WebUI.openBrowser(GlobalVariable.MAKEMYTRIPURL)
		WebUI.maximizeWindow()
		WebUI.click(locate1.rndTripChckBox())
		Thread.sleep(2000)
		WebUI.click(locate1.frmLocation())
		WebUI.setText(locate1.frmTxt(), 'Bengaluru')
		WebUI.click(locate1.clickFromLocation())
		WebUI.click(locate1.clicktoLocation())
		WebUI.setText(locate1.setTextTo(), 'Hyderabad')
		WebUI.click(locate1.setReturn())

		//				Thread.sleep(2000)
		//		WebUI.sendKeys(locate1.frmTxt(), 'Bengaluru')

		//		List<WebElement> lst = WebUI.findWebElements(locate1.lstLoc(), 4)
		//		println(lst.size())
		//		for(WebElement loc : lst) {
		//			println(loc.getText())
		//			if(loc.getText().equals("BLR")) {
		//				loc.click()
		//				break
		//			}
		//		}
		//		WebUI.click(locate1.clickFromLocation())
		//		WebUI.click(locate1.frmLocation())
		//		Thread.sleep(2000)
		//		WebUI.setText(locate1.toTxt(), 'Hyderabad')
		//		WebUI.click(locate1.toLocation())
		WebUI.click(locate1.clickDept())
		while(true) {
			String loc = WebUI.getText(locate1.getDate())
			println(loc)
			if(loc.equals(GlobalVariable.DEP_MONTH)) {
				break;
			}
			else {
				WebUI.click(locate1.NxtMnth())
			}
		}
		List<WebElement> date = WebUI.findWebElements(locate1.Dates(), 4)

		for(WebElement ele : date) {
			String date_txt	= ele.getText()
			println(date_txt)
			//			String[] str=  date_txt.split("\n")
			if(date_txt.equals(GlobalVariable.START_DATE)) {
				ele.click()
				ele.click()

				break
			}
		}
		WebUI.click(locate1.Ret_Click())
		while(true) {
			String loc = WebUI.getText(locate1.getDate())
			println(loc)
			if(loc.equals(GlobalVariable.RETURN_MONTH)) {
				break;
			}
			else {
				WebUI.click(locate1.NxtMnth())
			}
		}
		List<WebElement> date1 = WebUI.findWebElements(locate1.Dates(), 4)

		for(WebElement ele : date1) {
			String date_txt	= ele.getText()
			println(date_txt)
			//			String[] str=  date_txt.split("\n")
			if(date_txt.equals(GlobalVariable.END_DATE)) {
				ele.click()
				//				ele.click()
				break
			}
		}

		WebUI.click(locate1.TravelClassClick())
		WebUI.click(locate1.clickSeats())
		WebUI.click(locate1.clickBusiness())
		WebUI.click(locate1.apply())
		WebUI.click(locate1.srchBtn())
		WebUI.delay(17)




		//		List<WebElement> ele = WebUI.findWebElements(locate1.lstAge(), 4)
		//
		//		for(WebElement data : ele) {
		//			println(data.getText())
		//			if(data.getText().equals(GlobalVariable.SEATS)) {
		//				data.click()
		//				break
		//
		//			}
		//		}
	}
}
