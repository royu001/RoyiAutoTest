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

WebUI.callTestCase(findTestCase('Login_UI'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('IndexMenuPage/tbtn_systemTools'))

WebUI.click(findTestObject('IndexMenuPage/tbtn_formBuild'))

WebUI.delay(3)

WebUI.switchToFrame(findTestObject('FormBuildPage/iframe_formBuild'), 0)

WebUI.dragAndDropToObject(findTestObject('FormBuildPage/tbox_textBox'), findTestObject('FormBuildPage/pl_formSpace'))

WebUI.dragAndDropToObject(findTestObject('FormBuildPage/tbox_richBox'), findTestObject('FormBuildPage/pl_formSpace'))

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Logout_UI'), [:], FailureHandling.STOP_ON_FAILURE)

