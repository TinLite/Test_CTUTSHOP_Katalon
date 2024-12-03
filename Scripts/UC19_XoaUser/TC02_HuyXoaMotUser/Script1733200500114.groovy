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

WebUI.navigateToUrl('http://127.0.0.1:8000/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_CTUT SHOP/a_ng nhp'))

WebUI.setText(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_Log in  Django site admin/input_Username_username'), 
    'nbduy')

WebUI.click(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_Log in  Django site admin/div_Password'))

WebUI.click(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_Log in  Django site admin/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_Log in  Django site admin/input_Password_password'), 
    '3n8BkLzOQeHPGOzrvSM+nA==')

WebUI.click(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_Log in  Django site admin/input_submit'))

WebUI.click(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_Site administration  Django site admin/a_Users'))

WebUI.click(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_Select user to change  Django site admin/td_Staff status_action-checkbox'))

WebUI.selectOptionByValue(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_Select user to change  Django site admin/select_---------  Delete selected users'), 
    'delete_selected', true)

WebUI.click(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_Select user to change  Django site admin/div_Action   ---------  Delete selected use_cc564b'))

WebUI.click(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_Select user to change  Django site admin/button_Go'))

WebUI.click(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_Are you sure  Django site admin/a_No, take me back'))

WebUI.verifyElementPresent(findTestObject('Object Repository/UC19_XoaUser/TC02_HuyXoaMotUserThanhCong/Page_Select user to change  Django site admin/div_Select user to change                  _9bb031'), 
    0)

WebUI.closeBrowser()

