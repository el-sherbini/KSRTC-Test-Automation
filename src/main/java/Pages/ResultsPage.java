package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage extends BasePage{

    public ResultsPage(WebDriver driver) {
        super(driver);
    }

    private By selectSeatBtn = By.xpath("//div[@class=\"s-result-list\"]//input[@id=\"SrvcSelectBtnForward0\"][1]");
    public void clickSelectSeatBtn() {
        clickElement(selectSeatBtn);
    }

    private By availableSeatBtn = By.xpath("//div[contains(@id, \"seatlayout-Forward1\")]//li[contains(@class, \"availSeatClass\")][1]");
    public void clickAvailableSeatBtn() {
        clickElement(availableSeatBtn);
    }

    private By boardingPointSelect = By.xpath("//ul[@class=\"bordingPoint-list\"]//li[contains(@class, \"boarding\")]");
    public void clickBoardingPointSelect() {
        clickElement(boardingPointSelect);
    }

    private By droppingPointSelect = By.xpath("//ul[@class=\"bordingPoint-list\"]//li[contains(@class, \"droping\")]");
    public void clickDroppingPointSelect() {
        clickElement(droppingPointSelect);
    }

    private By mobileNoTxtFld = By.xpath("//div[@id=\"Forwardprofile\"]//input[@id=\"mobileNo\"]");
    public void setMobileNoTxtFld(String mobileNo) {
        sendKeysToElement(mobileNoTxtFld, mobileNo);
    }

    private By emailTxtFld = By.xpath("//div[@id=\"Forwardprofile\"]//input[@id=\"email\"]");
    public void setEmailTxtFld(String email) {
        sendKeysToElement(emailTxtFld, email);
    }

    private By nameTxtFld = By.xpath("//div[@id=\"PaxTblForward\"]//input[@id=\"passengerNameForward0\"]");
    public void setNameTxtFld(String name) {
        sendKeysToElement(nameTxtFld, name);
    }

    private By ageTxtFld = By.xpath("//div[@id=\"PaxTblForward\"]//input[@id=\"passengerAgeForward0\"]");
    public void setAgeTxtFld(String age) {
        sendKeysToElement(ageTxtFld, age);
    }

    private By genderDropDown = By.xpath("//div[@id=\"PaxTblForward\"]//select[@id=\"genderCodeIdForward0\"]");
    public WebElement getGenderDropDown() {
        return findElement(genderDropDown);
    }

    private By concessionDropDown = By.xpath("//div[@id=\"PaxTblForward\"]//select[@id=\"concessionIdsForward0\"]");
    public WebElement getConcessionDropDown() {
        return findElement(concessionDropDown);
    }

    private By countryDropDown = By.xpath("//div[@id=\"PaxTblForward\"]//select[@id=\"nationalityForward0\"]");
    public WebElement getCountryDropDown() {
        return findElement(countryDropDown);
    }

    private By makePaymentBtn = By.id("PgBtn");
    public void clickMakePaymentBtn() {
        clickElement(makePaymentBtn);
    }
}