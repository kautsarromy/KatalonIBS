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

WebUI.openBrowser('https://peo.pelindo.co.id/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Page_PELINDO E-OFFICE  PT PELABUHAN INDONESIA (PERSERO)/Form Login'), 0)

WebUI.verifyElementPresent(findTestObject('Page_PELINDO E-OFFICE  PT PELABUHAN INDONESIA (PERSERO)/input_Show password_user_email'), 
    0)

WebUI.setText(findTestObject('Page_PELINDO E-OFFICE  PT PELABUHAN INDONESIA (PERSERO)/input_Show password_user_email'), 
    '208707004')

WebUI.verifyElementPresent(findTestObject('Page_PELINDO E-OFFICE  PT PELABUHAN INDONESIA (PERSERO)/input_Show password_password'), 
    0)

WebUI.setEncryptedText(findTestObject('Page_PELINDO E-OFFICE  PT PELABUHAN INDONESIA (PERSERO)/input_Show password_password'), 
    '2NsZvP3Lf6Vl0tILlyPy0A==')

WebUI.verifyElementPresent(findTestObject('Page_PELINDO E-OFFICE  PT PELABUHAN INDONESIA (PERSERO)/button_Sign In'), 0)

WebUI.click(findTestObject('Page_PELINDO E-OFFICE  PT PELABUHAN INDONESIA (PERSERO)/button_Sign In'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_PELINDO E-OFFICE  PT PELABUHAN INDONESIA (PERSERO)/img_Tutup Poster_gambar'), 
    0)

