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

'调用登陆测试用例'
WebUI.callTestCase(findTestCase('Login_UI'), [:], FailureHandling.STOP_ON_FAILURE)

'点击“系统管理”菜单'
WebUI.click(findTestObject('IndexMenuPage/tbtn_systemManage'))

'点击“用户管理”菜单'
WebUI.click(findTestObject('IndexMenuPage/tbtn_userManage'))

WebUI.delay(1)

'切换到组织结构iframe'
WebUI.switchToFrame(findTestObject('UserManagePase/iframe_divisonalManage'), 0)

'点击选择“测试部门”'
WebUI.click(findTestObject('UserManagePase/tbtn_selectDepartment'))

WebUI.delay(1)

'点击“新增”按钮'
WebUI.click(findTestObject('UserManagePase/btn_addUser'))

WebUI.delay(1)

'切换到默认iframe'
WebUI.switchToDefaultContent()

'切换到用户管理iframe'
WebUI.switchToFrame(findTestObject('UserManagePase/AddUserPage/iframe_addUser'), 0)

'输入用户名称'
WebUI.sendKeys(findTestObject('UserManagePase/AddUserPage/tbox_userName'), findTestData('AddUserData/User1').getValue(1, 
        1))

'输入手机号'
WebUI.sendKeys(findTestObject('UserManagePase/AddUserPage/tbox_phoneNumber'), findTestData('AddUserData/User1').getValue(
        2, 1))

'输入登陆名'
WebUI.sendKeys(findTestObject('UserManagePase/AddUserPage/tbox_loginName'), findTestData('AddUserData/User1').getValue(3, 
        1))

'选择性别女'
WebUI.selectOptionByValue(findTestObject('UserManagePase/AddUserPage/dbtn_userSex'), '1', false)

'选择岗位为普通员工'
WebUI.selectOptionByLabel(findTestObject('UserManagePase/AddUserPage/dbtn_userPost'), '普通员工', false)

'选择角色为普通角色'
WebUI.check(findTestObject('UserManagePase/AddUserPage/cbtn_userRole'))

'点击归属部门文本框'
WebUI.click(findTestObject('UserManagePase/AddUserPage/tbox_deptName'))

WebUI.delay(1)

'切换到部门目录树iframe'
WebUI.switchToFrame(findTestObject('UserManagePase/AddUserPage/iframe_postTree'), 0)

'选择部门'
WebUI.click(findTestObject('UserManagePase/AddUserPage/tbtn_selectPost'))

'切换到默认'
WebUI.switchToDefaultContent()

'切换到新增用户'
WebUI.switchToFrame(findTestObject('UserManagePase/AddUserPage/iframe_addUser'), 0)

WebUI.delay(1)

'点击选择部门弹窗中的确定按钮'
WebUI.click(findTestObject('UserManagePase/AddUserPage/btn_okPost'))

'输入邮箱'
WebUI.sendKeys(findTestObject('UserManagePase/AddUserPage/tbox_userEmail'), findTestData('AddUserData/User1').getValue(4, 
        1))

'清空密码框'
WebUI.clearText(findTestObject('UserManagePase/AddUserPage/tbox_userPass'))

'输入密码'
WebUI.sendKeys(findTestObject('UserManagePase/AddUserPage/tbox_userPass'), findTestData('AddUserData/User1').getValue(5, 
        1))

'输入备注信息'
WebUI.sendKeys(findTestObject('UserManagePase/AddUserPage/tbox_userRemark'), findTestData('AddUserData/User1').getValue(
        6, 1))

'点击保存按钮'
WebUI.click(findTestObject('UserManagePase/AddUserPage/btn_userSave'))

'切换到默认iframe'
WebUI.switchToDefaultContent()

'切换到用户管理iframe'
WebUI.switchToFrame(findTestObject('UserManagePase/iframe_userManage'), 0)

'保存执行结果截图'
WebUI.takeScreenshot('SuccessMessage.jpg', FailureHandling.STOP_ON_FAILURE)

'调用退出登陆测试用例'
WebUI.callTestCase(findTestCase('Logout_UI'), [:], FailureHandling.STOP_ON_FAILURE)

