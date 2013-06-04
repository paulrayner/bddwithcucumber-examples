package cucumber.examples.java.ch6;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.examples.java.helloworld.Hello;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: paul
 * Date: 6/4/13
 * Time: 11:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class myhellostepdefs {
    private Hello hello;
    private String hi;

    @Given("^I have a hello app with \"([^\"]*)\"$")
    public void I_have_a_hello_app_with(String greeting) {
        hello = new Hello(greeting);
    }

    @When("^I ask it to say hi$")
    public void I_ask_it_to_say_hi() {
        hi = hello.sayHi();
    }

    @Then("^it should answer with \"([^\"]*)\"$")
    public void it_should_answer_with(String expectedHi) {
        assertEquals(expectedHi, hi);
    }
}
