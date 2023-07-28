import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


def customer_infor = [
				customer1: [
						firstname: "leee"	,
						lastname: "viiii",
						email: "vulvh2@firegroup.io",
					],
				customer2: [
					firstname: "le"	,
					lastname: "vi",
					email: "vulvh3@firegroup.io",
					
					],
					customer3: [
						firstname: "tran"	,
						lastname: "vien",
						email: "vulvh4@firegroup.io",
						
						],
					]		
					

WebUI.openBrowser('https://auto2023.myshopify.com/account/register')
WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/buoi3/input_firstname'), customer_infor.customer1.firstname)
WebUI.setText(findTestObject('Object Repository/buoi3/input_lastname'), customer_infor.customer1.lastname)
EmailClick(customer_infor.customer1.email)
//WebUI.setText(findTestObject('Object Repository/buoi3/input_email'), customer_infor.customer1.email)
WebUI.setText(findTestObject('Object Repository/buoi3/input_password'), 'Ac2F6G44n6FIxxk9v6S+AA==')
WebUI.click(findTestObject('Object Repository/buoi3/bnt_create'))

def EmailClick(def email) {
	for(int i=0;i<5;i++) {
		WebUI.setText(findTestObject('Object Repository/buoi3/input_email'), email)
	}
}
