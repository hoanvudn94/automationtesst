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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.shopify.com/partners')

WebUI.click(findTestObject('Object Repository/Page_Become a Shopify Partner Today - Shopi_7b6963/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Log in  Partners/input_Email_accountemail'), 'vulvh@firegroup.io')

WebUI.click(findTestObject('Object Repository/Page_Log in  Partners/button_Continue with Email'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Shopify/input_Password_accountpassword'), 'Ac2F6G44n6FIxxk9v6S+AA==')

WebUI.click(findTestObject('Object Repository/Page_Shopify/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Organizations - Shopify Partners/span_FireApps Dev'))

WebUI.closeBrowser()

