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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://github.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/List/Page_The worlds leading software developmen_e309d9/a_Signin'))

WebUI.setText(findTestObject('Object Repository/List/Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 
    findTestData('Test').getValue(1, 1))

WebUI.setText(findTestObject('Object Repository/List/Page_Sign in to GitHub  GitHub/input_Forgot password_password'), findTestData(
        'Test').getValue(2, 1))

WebUI.click(findTestObject('Object Repository/List/Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Object Repository/List/Page_GitHub/span_New project_dropdown-caret'))

WebUI.click(findTestObject('Object Repository/List/Page_GitHub/a_Your gists'))

WebUI.delay(20)

WebUI.closeBrowser()

