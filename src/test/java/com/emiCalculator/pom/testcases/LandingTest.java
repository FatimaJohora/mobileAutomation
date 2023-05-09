package com.emiCalculator.pom.testcases;

import com.emiCalculator.pom.emiBaseTest.EmiCalculatorBaseTest;
import com.emiCalculator.pom.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingTest extends EmiCalculatorBaseTest {

    @Test
    public void emiCalculatorBtnShouldBeShown(){
        LandingPage landingPage= new LandingPage();
        Assert.assertTrue(landingPage.isEmiCalculatorBtn());
    }

    @Test
    public void emiCompareLoanBtnShouldBeShown(){
        LandingPage landingPage= new LandingPage();
        Assert.assertTrue(landingPage.isCompareLoanBtn());
    }
}
