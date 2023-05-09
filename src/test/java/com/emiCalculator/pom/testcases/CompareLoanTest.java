package com.emiCalculator.pom.testcases;

import com.emiCalculator.pom.emiBaseTest.EmiCalculatorBaseTest;
import com.emiCalculator.pom.pages.CompareLoanPage;
import com.emiCalculator.pom.pages.LandingPage;
import org.testng.annotations.Test;

public class CompareLoanTest extends EmiCalculatorBaseTest {
    CompareLoanPage compareLoanPage;
    @Test
    public void compareLoanShouldSucceed() {
        compareLoanPage =new LandingPage()
                .tabCompareLoanBtn();
         compareLoanPage = compareLoanPage
                .fillLoanAmount1(850000)
                .fillInterest1(9)
                .fillPeriod1(12)
                .fillLoanAmount2(200000)
                .fillInterest2(8)
                .fillPeriod2(11)
                .tapBtnCalculate();
    }

    @Test
    public void resetLoanShouldSucceed() {
        compareLoanPage = compareLoanPage
                .fillLoanAmount1(780000)
                .fillInterest1(9)
                .fillPeriod1(12)
                .fillLoanAmount2(820000)
                .fillInterest2(12)
                .fillPeriod2(10)
                .tapBtnReset();
    }

}
