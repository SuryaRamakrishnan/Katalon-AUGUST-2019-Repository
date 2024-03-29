import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(null);

WebUI.navigateToUrl("http://newtours.demoaut.com/mercurywelcome.php");

WebUI.maximizeWindow();

WebUI.waitForPageLoad(30);

WebUI.click(findTestObject('Object Repository/MercuryApplication/Page_Welcome Mercury Tours/lnka_REGISTER'));

WebUI.waitForElementPresent(findTestObject('Object Repository/MercuryApplication/Page_RegisterMercuryTours/txtinput_FirstName'), 5)


WebUI.sendKeys(findTestObject('Object Repository/MercuryApplication/Page_RegisterMercuryTours/txtinput_FirstName'),"First Name");




