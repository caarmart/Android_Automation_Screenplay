package step_definitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import errors.assertions.ErrorValidationAssertion;
import interactions.Load;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.TheResult;
import tasks.MathOperation;

import static errors.assertions.ErrorValidationAssertion.ERROR_VALIDATION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.aNewActor;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Calculator {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^I load the Calculator Application$")
    public void iLoadTheCalculatorApplication() {
        aNewActor().wasAbleTo(Load.theApplication());
    }

    @When("^I realize the (.*) math operation between (.*) and (.*)$")
    public void iRealizeTheMathOperationBetweenAnd(String mathOperation, int firstNumber, int secondNumber) {
        theActorInTheSpotlight().attemptsTo(new MathOperation(mathOperation, firstNumber, secondNumber));
    }

    @Then("^I verify that result equals to the expectedResult$")
    public void iVerifyThatResultEqualsToTheExpectedResult() {
        theActorInTheSpotlight().should(seeThat(TheResult.equalsToExpectedResult()).orComplainWith(ErrorValidationAssertion.class, ERROR_VALIDATION));
    }
}
