package com.emiCalculator.pom.pages;

import com.emiCalculator.pom.emiBaseTest.EmiCalculatorBaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends EmiCalculatorBaseTest {
    @FindBy(id = "btnStart")
    WebElement btnStart;

    @FindBy(id = "btnCompare")
    WebElement btnCompare;

    public LandingPage() {
        PageFactory.initElements(driver, this);
    }

    public EmiCalculatorPage tabEmiCalculatorBtn() {
        btnStart.isDisplayed();
        btnStart.click();
        return new EmiCalculatorPage();
    }
    public CompareLoanPage tabCompareLoanBtn(){
        btnCompare.isDisplayed();
        btnCompare.click();
        return new CompareLoanPage();
    }

    public boolean isEmiCalculatorBtn(){
        return btnStart.isDisplayed();
    }

    public boolean isCompareLoanBtn(){
        return btnCompare.isDisplayed();
    }
}
