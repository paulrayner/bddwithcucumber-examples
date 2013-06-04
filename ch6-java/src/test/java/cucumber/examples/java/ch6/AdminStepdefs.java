package cucumber.examples.java.ch6;

import coypu.BrowserSession;
import coypu.Drivers.Browser;
import coypu.Drivers.Selenium.SeleniumWebDriver;
import coypu.SessionConfiguration;
import cucumber.api.java.en.Given;

/**
 * Created with IntelliJ IDEA.
 * User: paul
 * Date: 6/4/13
 * Time: 10:41 AM
 * To change this template use File | Settings | File Templates.
 */


public class AdminStepdefs {
    @Given("^I'm on the main admin page$")
    public void Im_on_the_main_admin_page() {
        SessionConfiguration sessionConfiguration = new SessionConfiguration();
        sessionConfiguration.Driver = SeleniumWebDriver.class;
        sessionConfiguration.Browser = Browser.Firefox;

        BrowserSession browser = new BrowserSession(sessionConfiguration);
        browser.visit("www.google.com");
    }
}
