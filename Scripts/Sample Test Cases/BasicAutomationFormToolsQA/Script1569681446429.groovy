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

WebUI.navigateToUrl(GlobalVariable.URL);

WebUI.comment('Automation Practice Form Launched');
//WebUI.waitForPageLoad(30);

WebUI.waitForElementPresent(findTestObject('Object Repository/ToolsQABasicForm/Page_Demo Form for practicing Selenium Automation/span_HOME'), GlobalVariable.G_TimeOut);
//println(obj)
//WebUI.sendKeys(findTestObject('Object Repository/ToolsQABasicForm/Page_Demo Form for practicing Selenium Automation/input_First name_firstname'), "My First Name");

WebUI.setText(findTestObject('Object Repository/ToolsQABasicForm/Page_Demo Form for practicing Selenium Automation/input_First name_firstname'), Name);


WebUI.comment('First Name Entered ');


WebUI.closeBrowser();


