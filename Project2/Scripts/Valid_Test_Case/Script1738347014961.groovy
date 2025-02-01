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

WebUI.navigateToUrl('https://qa-practice.netlify.app/auth_ecommerce')

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/button_Learn with RV - YouTube_sidebarCollapse'))

WebUI.setText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_Email_emailAddress'), 'admin@admin.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/button_ADD TO CART'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_918.99_cart-quantity-input'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/button_PROCEED TO CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_Phone number_phone'), '1234567890')

WebUI.setText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_Street_street'), 'LPU')

WebUI.setText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/input_City_city'), 'Phagwara')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_QA Practice  Learn with RV/select_Select a country.              Afgha_f92af3'), 
    'India', true)

WebUI.click(findTestObject('Object Repository/Page_QA Practice  Learn with RV/button_Submit Order'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_QA Practice  Learn with RV/div_Congrats Your order of  918.99  has bee_00021c'), 
    'Congrats! Your order of $918.99 has been registered and will be shipped to LPU, Phagwara - India.')

WebUI.closeBrowser()

