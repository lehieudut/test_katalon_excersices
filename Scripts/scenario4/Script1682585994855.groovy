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

WebUI.openBrowser('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('scenario4/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('scenario4/Page_Customer Login/input_Email_loginusername'), 'lehieuman13@gmail.com')

WebUI.setText(findTestObject('scenario4/Page_Customer Login/input_Password_loginpassword'), '1234567Abx')

WebUI.click(findTestObject('scenario4/Page_Customer Login/button_Sign In'))

WebUI.mouseOver(findTestObject('scenario4/Page_Home Page/div_Radiant Tee Rating603ReviewsAs low as22.00XSSMLXL  Add to CartAdd to Wish ListAdd to Compare'))

WebUI.click(findTestObject('scenario4/Page_Home Page/div_XS'))

WebUI.click(findTestObject('scenario4/Page_Home Page/div_XL_option-label-color-93-item-50'))

WebUI.click(findTestObject('scenario4/Page_Home Page/button_Add to Cart'))

WebUI.verifyElementText(findTestObject('scenario4/Page_Home Page/span_1'), '1')

WebUI.closeBrowser()

