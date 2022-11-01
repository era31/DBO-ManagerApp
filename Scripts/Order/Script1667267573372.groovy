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

Mobile.startExistingApplication('com.dboapp')

Mobile.tap(findTestObject('Object Repository/Salesman/android.widget.EditText - Email  No. Handphone'), 0)

Mobile.setText(findTestObject('Salesman/Login Email  No. Handphone'), 'asadekade52@gmail.com', 0)

Mobile.checkElement(findTestObject('Salesman/Login-Selanjutnya'), 0)

Mobile.tap(findTestObject('Salesman/Login - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Salesman/android.widget.EditText - Password (1)'), 'Passw0rd@', 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.view.View (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.widget.TextView -'), 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.widget.TextView - Lihat Keranjang'), 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.widget.TextView - Proses'), 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.widget.TextView - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.widget.TextView - (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Salesman/android.widget.TextView - Order Saya'), 0)

Mobile.closeApplication()

