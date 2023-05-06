package com.calculator;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest {

    @Test
    public void addShouldSucceed() {
        driver.findElement(By.id("digit_9"));
        driver.findElement(By.id("op_add"));
        driver.findElement(By.id("digit_7"));
        driver.findElement(By.id("eq"));

    }

    @Test
    public void subtractShouldSucceed() {
        driver.findElement(By.id("digit_9"));
        driver.findElement(By.id("op_sub"));
        driver.findElement(By.id("digit_2"));
        driver.findElement(By.id("eq"));

    }

    @Test
    public void multiplyShouldSucceed() {
        driver.findElement(By.id("digit_8"));
        driver.findElement(By.id("op_mul"));
        driver.findElement(By.id("digit_6"));
        driver.findElement(By.id("eq"));

    }

    @Test
    public void divisionShouldSucceed() {
        driver.findElement(By.id("digit_8"));
        driver.findElement(By.id("op_div"));
        driver.findElement(By.id("digit_2"));
        driver.findElement(By.id("eq"));

    }

    @Test
    public void percentageShouldSucceed() {
        driver.findElement(By.id("digit_8"));
        driver.findElement(By.id("op_div"));
        driver.findElement(By.id("digit_2"));
        driver.findElement(By.id("op_mul"));
        driver.findElement(By.id("digit_1"));
        driver.findElement(By.id("digit_0"));
        driver.findElement(By.id("digit_0"));
        driver.findElement(By.id("eq"));

    }
}
