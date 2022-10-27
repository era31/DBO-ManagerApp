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

WebUI.navigateToUrl('https://mngr.dbo.id/')

WebUI.waitForElementPresent(findTestObject('Object Repository/Manager App/Page_DBO - Login/input_MASUK_email'), 10)

WebUI.setText(findTestObject('Object Repository/Manager App/Page_DBO - Login/input_MASUK_email'), 'ginda.manager@dbo.id')

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Login/form_Lupa Kata Sandi'))

WebUI.setEncryptedText(findTestObject('Object Repository/Manager App/Page_DBO - Login/input_MASUK_password'), 'Co+u9P3R+hiJhysBoc6jhQ==')

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Login/input_Lupa Kata Sandi_btnLogin'))

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Dasbor/span_Manajemen Pemesanan'))

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Dasbor/span_Manajemen Pemesanan'))

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Dasbor/span_Manajemen Pemesanan'))

WebUI.click(findTestObject('Manager App/Page_DBO - Manajemen Pemesanan - Daftar Pemesanan/a_Manager_btn btn-primary btn-xs'))

WebUI.setText(findTestObject('Manager App/Page_DBO - Manajemen Pemesanan - Buat Surat Jalan/input_Rp 22.200,00_form-control delivery-qty'), 
    '21')

WebUI.setText(findTestObject('Manager App/Page_DBO - Manajemen Pemesanan - Buat Surat Jalan/input_Nomor Surat Jalan_sjRefNumber'), 
    'OA0101221027A2GTV5')

WebUI.click(findTestObject('Manager App/Page_DBO - Manajemen Pemesanan - Buat Surat Jalan/input_Tanggal Surat Jalan_sjRefDate'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Manager App/Page_DBO - Manajemen Pemesanan - Buat Surat Jalan/td_27'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Manager App/Page_DBO - Manajemen Pemesanan - Buat Surat Jalan/input_Nama Supir_supir'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Manager App/Page_DBO - Manajemen Pemesanan - Buat Surat Jalan/input_Plat Nomor_plat_no'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Manager App/Page_DBO - Manajemen Pemesanan - Buat Surat Jalan/textarea_Internal Comment_internal_comment'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Manager App/Page_DBO - Manajemen Pemesanan - Buat Surat Jalan/textarea_Notes_notes'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Manager App/Page_DBO - Manajemen Pemesanan - Buat Surat Jalan/button_Process'))

