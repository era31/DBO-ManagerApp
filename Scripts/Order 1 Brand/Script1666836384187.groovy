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

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Manajemen Pemesanan - Daftar Pemesanan/a_Tambah Baru'))

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Manajemen Pemesanan - Buat Pemesanan/span_Pencarian Toko_select2-selection selec_cfff5e'))

WebUI.setText(findTestObject('Object Repository/Manager App/Page_DBO - Manajemen Pemesanan - Buat Pemesanan/input_Copyright  2022_select2-search__field'), 
    'Demo Toko prelive 1')

WebUI.sendKeys(findTestObject('Object Repository/Manager App/Page_DBO - Manajemen Pemesanan - Buat Pemesanan/input_Copyright  2022_select2-search__field'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Manager App/Page_DBO - Manajemen Pemesanan - Buat Pemesanan/input_Pilih Produk_search'), 
    'fitting')

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Manajemen Pemesanan - Buat Pemesanan/a_Search'))

WebUI.setText(findTestObject('Object Repository/Manager App/Page_DBO - Manajemen Pemesanan - Buat Pemesanan/input'), '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/Manager App/Page_DBO - Manajemen Pemesanan - Buat Pemesanan/select_pcs                                 _6deeeb'), 
    'box', true)

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Manajemen Pemesanan - Buat Pemesanan/a_Rp_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Manajemen Pemesanan - Buat Pemesanan/a_Process'))

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Process Order/button_Submit'))

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Manajemen Pemesanan - Daftar Pemesanan/img_See More_user-image'))

WebUI.click(findTestObject('Object Repository/Manager App/Page_DBO - Manajemen Pemesanan - Daftar Pemesanan/a_Keluar'))

