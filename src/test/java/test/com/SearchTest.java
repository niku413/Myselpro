/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import com.itexps.SearchPage;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Ishvar
 */
public class SearchTest {

    private static WebDriver driver;
    private String baseUrl;

    public SearchTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testgoogleSearch() {
        driver.get("http://www.google.com");
        SearchPage sp = PageFactory.initElements(driver, SearchPage.class);
        sp.searchFor("basketball");
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
