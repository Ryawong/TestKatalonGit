import java.awt.TexturePaintContext.Byte as Byte
import java.lang.reflect.Array as Array
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.sun.xml.internal.fastinfoset.util.StringArray as StringArray
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

Random ran = new Random();
int num = ran.nextInt(26) + (byte)'a';
System.out.println((char)num);
String randomString = (char)num;
String randomEmail = randomString + "@gmail.com";


String randomNumber = "";
for (int i = 0; i < 14; i++) {
	int number = ran.nextInt(9);
	randomNumber += number;
}

WebUI.openBrowser('')

WebUI.navigateToUrl('http://vivblind.play2pay.me/volunteer/register')

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_EMAIL'), randomEmail)

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_PASSWORD'), 'Mint250831')

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_password_confirmation'), 'Mint250831')

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_FIRST_NAME_TH'), 'รัตนาภรณ์')

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_LAST_NAME_TH'), 'ยาวงศ์')

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_FIRST_NAME_EN'), 'Rattanaporn')

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_LAST_NAME_EN'), 'Yawong')

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_BIRTH_DATE'), '25/08/1988')

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_CITIZEN_ID'), randomNumber)

WebUI.selectOptionByValue(findTestObject('register_volunteer_screen/Page_ -/select_RELIGION'), 'พุทธ', true)

WebUI.selectOptionByValue(findTestObject('register_volunteer_screen/Page_ -/select_EDUCATIONAL'), 'ปริญญาตรี', true)

WebUI.selectOptionByValue(findTestObject('register_volunteer_screen/Page_ -/select_CAREER'), 'อื่นๆ', true)

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_ADDRESS_NO'), '324/94')

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_ADDRESS_MOO'), '3')

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_ADDRESS_ROAD'), '-')

WebUI.selectOptionByValue(findTestObject('register_volunteer_screen/Page_ -/select_ADDRESS_PROVINCE'), '38', true)

WebUI.selectOptionByValue(findTestObject('register_volunteer_screen/Page_ -/select_ADDRESS_DISTRICT'), '582', true)

WebUI.selectOptionByValue(findTestObject('register_volunteer_screen/Page_ -/select_ADDRESS_SUBDISTRICT'), '14047', true)

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_ADDRESS_POSTCODE'), '50230')

WebUI.selectOptionByValue(findTestObject('register_volunteer_screen/Page_ -/select_STATUS_EDU_WORK'), 'กำลังทำงาน', true)

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_ADDRESS_ALL'), '324/94 ม.3 ')

WebUI.setText(findTestObject('register_volunteer_screen/Page_ -/input_CELL_PHONE'), randomNumber)

WebUI.click(findTestObject('register_volunteer_screen/Page_ -/input_btn btn-primary'))

WebUI.closeBrowser()

