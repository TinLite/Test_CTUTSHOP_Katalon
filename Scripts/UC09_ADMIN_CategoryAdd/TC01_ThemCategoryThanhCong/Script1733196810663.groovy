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

WebUI.navigateToUrl('http://127.0.0.1:8000/admin/login/?next=/admin/')

WebUI.setText(findTestObject('Object Repository/UC09/Page_Log in  Django site admin/input_Username_username'), 'nbduy')

WebUI.setEncryptedText(findTestObject('Object Repository/UC09/Page_Log in  Django site admin/input_Password_password'), 
    '3n8BkLzOQeHPGOzrvSM+nA==')

WebUI.click(findTestObject('Object Repository/UC09/Page_Log in  Django site admin/input_submit'))

WebUI.click(findTestObject('Object Repository/UC09/Page_Site administration  Django site admin/a_Add'))

WebUI.setText(findTestObject('Object Repository/UC09/Page_Add categogy  Django site admin/input_Name_name'), 'Máy tính bảng')

WebUI.setText(findTestObject('Object Repository/UC09/Page_Add categogy  Django site admin/input_Slug_slug'), '113')

WebUI.click(findTestObject('Object Repository/UC09/Page_Add categogy  Django site admin/input_Slug__save'))

WebUI.verifyElementText(findTestObject('Object Repository/UC09/Page_Select categogy to change  Django site admin/li_The categogy My tnh bng was added successfully'), 
    'The categogy “Máy tính bảng” was added successfully.')

WebUI.closeBrowser()
