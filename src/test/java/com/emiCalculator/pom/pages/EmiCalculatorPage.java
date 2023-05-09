package com.emiCalculator.pom.pages;

import com.emiCalculator.pom.emiBaseTest.EmiCalculatorBaseTest;
import com.emiCalculator.pom.util.GeneralUtil;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.util.List;

public class EmiCalculatorPage extends EmiCalculatorBaseTest {
    @FindBy(id = "etLoanAmount")
    WebElement etLoanAmount;

    @FindBy(id = "etInterest")
    WebElement etInterest;

    @FindBy(id = "etYears")
    WebElement etYears;
    @FindBy(id = "etMonths")
    WebElement etMonths;

    @AndroidBy(id = "etFee")
    WebElement etFee;
    @AndroidBy(id = "btnCalculate")
    WebElement btnCalculate;
    @AndroidBy(id = "btnReset")
    WebElement btnReset;
    @FindBy(id = "btnDetail")
    List<WebElement> btnDetail;

  public EmiCalculatorPage(){
      PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(GeneralUtil.LOAD_TIME)), this);
}
public EmiCalculatorPage fillAmount(int amount){
    etLoanAmount.isDisplayed();
    etLoanAmount.clear();
    etLoanAmount.sendKeys(String.valueOf(amount));
    return this;

     }
    public EmiCalculatorPage fillInterestRate(int interestRate){
        etInterest.isDisplayed();
        etInterest.clear();
        etInterest.sendKeys(String.valueOf(interestRate));
        return this;

    }
    public EmiCalculatorPage fillYears(int year){
        etYears.isDisplayed();
        etYears.clear();
        etYears.sendKeys(String.valueOf(year));
        return this;

    }
    public EmiCalculatorPage fillMonths(int months){
        etMonths.isDisplayed();
        etMonths.clear();
        etMonths.sendKeys(String.valueOf(months));
        return this;

    }
    public EmiCalculatorPage fillFee(int fee){
        etFee.isDisplayed();
        etFee.clear();
        etFee.sendKeys(String.valueOf(fee));
        return this;

    }
    public EmiCalculatorPage tabCalculateBtn(){
        btnCalculate.isDisplayed();
        btnCalculate.click();
        return this;

    }
    public EmiCalculatorPage tabResetBtn(){
        btnReset.isDisplayed();
        btnReset.click();
        return this;

    }
    public boolean hasDetailBtn(){
     return btnDetail.size()>0;
    }

}



