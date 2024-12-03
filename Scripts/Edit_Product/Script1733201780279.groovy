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
try {
WebUI.openBrowser('')

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.click(findTestObject('Object Repository/Product/Page_CTUT SHOP/a_ng nhp'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Product/Page_Log in  Django site admin/input_Username_username'), 'nbduy', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/Product/Page_Log in  Django site admin/input_Password_password',), 
    '3n8BkLzOQeHPGOzrvSM+nA==', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Product/Page_Log in  Django site admin/input_submit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Product/Page_Site administration  Django site admin/a_Change'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Product/Page_Select product to change  Django site admin/a_Iphone X'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.selectOptionByValue(findTestObject('Object Repository/Product/Page_Iphone X  Change product  Django site admin/select_in thoi  My tnh bng  My Tnh'), 
    Cate, true, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Product/Page_Iphone X  Change product  Django site admin/input_Name_name'), 
    Name, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Product/Page_Iphone X  Change product  Django site admin/input_Price_price'), 
    Price, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.uploadFile(findTestObject('Product/Page_Iphone X  Change product  Django site admin/select_in thoi  My tnh bng  My Tnh'), 
    Files, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Product/Page_Iphone X  Change product  Django site admin/textarea_- Nh cc bn cng  bit th  4 nm k t c_ce64a3'), 
    Detail, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Product/Page_Iphone X  Change product  Django site admin/input_Detail__save'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Product/Page_Select product to change  Django site admin/li_The product My tnh X was changed successfully'), 
    Res, FailureHandling.CONTINUE_ON_FAILURE)
} catch (Exception e) {
	WebUI.comment("Test case gặp lỗi: " + e.message)
} finally {
WebUI.closeBrowser()
}
