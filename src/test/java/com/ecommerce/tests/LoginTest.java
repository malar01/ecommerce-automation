package com.ecommerce.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ecommerce.Base.BaseClass;
import com.ecommerce.PageClass.LoginPage;
import com.ecommerce.Utility.ReadExcel;

public class LoginTest extends BaseClass {
    LoginPage login;
    ReadExcel excel;

    @BeforeClass
    public void setUpExcel() {
        excel = new ReadExcel(); // Initialize once before tests
    }

    @DataProvider(name="LoginData")
    public Object[][] loginData() throws IOException {
        return excel.ReadExcelData("/Users/macbook/Documents/TestData.xlsx", "ValidLogin");
    }

    @Test(dataProvider="LoginData")
    public void LoginPageTest(String user, String pass) {
        login = new LoginPage(driver);
        login.loginUser(user, pass);

        String actualTitle = driver.getTitle();
        System.out.println("The Title is: " + actualTitle);

        String expectedTitle = "Swag Labs";
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}