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

WebUI.navigateToUrl('https://www.facebook.com/')

WebUI.setText(findTestObject('Object Repository/Positive Test/Page_Facebook  log in or sign up/input_email'), 'bayutrisetyobudi1998@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Positive Test/Page_Facebook  log in or sign up/input_pass'), 'XbjJ05ueDfGhEnnYzJdk9g==')

WebUI.click(findTestObject('Object Repository/Positive Test/Page_Facebook  log in or sign up/button_Log in'))

WebUI.click(findTestObject('Object Repository/Positive Test/Page_(6) Facebook/a_x1i10hfl xjbqb8w x6umtig x1b1mbwd xaqea5y_7351b9'))

WebUI.click(findTestObject('Object Repository/Positive Test/Page_(6) Facebook/a_x1i10hfl xjbqb8w x6umtig x1b1mbwd xaqea5y_7351b9'))

WebUI.click(findTestObject('Object Repository/Positive Test/Page_(6) Facebook/circle_xbh8q5q x1pwv2dq xvlca1e'))

WebUI.click(findTestObject('Object Repository/Positive Test/Page_(6) Facebook/span_Keluar'))

WebUI.closeBrowser()
