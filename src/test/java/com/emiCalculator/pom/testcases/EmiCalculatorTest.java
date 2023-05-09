package com.emiCalculator.pom.testcases;

import com.emiCalculator.pom.emiBaseTest.EmiCalculatorBaseTest;
import com.emiCalculator.pom.pages.EmiCalculatorPage;
import com.emiCalculator.pom.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiCalculatorTest extends EmiCalculatorBaseTest {
    EmiCalculatorPage emiCalculatorPage;

    @Test
    public void emiCalculatorShouldSucceed() {
        emiCalculatorPage = new LandingPage()
                .tabEmiCalculatorBtn();

        emiCalculatorPage = emiCalculatorPage
                .fillAmount(500000)
                .fillInterestRate(9)
                .fillYears(1)
                .fillMonths(6)
                .fillFee(2)
                .tabCalculateBtn();
        Assert.assertTrue(emiCalculatorPage.hasDetailBtn());


    }

    @Test
    public void resetEmiCalculatorShouldSucceed() {

        emiCalculatorPage = emiCalculatorPage
                .fillAmount(500000)
                .fillInterestRate(9)
                .fillYears(1)
                .fillMonths(6)
                .fillFee(2)
                .tabCalculateBtn()
                .tabResetBtn();
        Assert.assertFalse(emiCalculatorPage.hasDetailBtn());

    }
}
