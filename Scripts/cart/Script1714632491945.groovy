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

Mobile.startApplication('C:\\Users\\triaa\\Automate\\Katalon Studio\\Final\\mobileapp\\WalmartShopping.apk', true)

Mobile.tap(findTestObject('Object Repository/WALMART/Continue sharing precise location'), 0)

Mobile.tap(findTestObject('Object Repository/WALMART/Continue as guest'), 0)

Mobile.tap(findTestObject('Object Repository/WALMART/Share precise location'), 0)

Mobile.tap(findTestObject('Object Repository/WALMART/Close'), 0)

Mobile.tap(findTestObject('Object Repository/WALMART/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/WALMART/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/WALMART/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/WALMART/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/WALMART/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/WALMART/android.widget.Button - Checkout all items'), 0)

Mobile.closeApplication()

