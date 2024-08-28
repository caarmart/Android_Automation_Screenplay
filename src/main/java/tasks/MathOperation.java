package tasks;

import interactions.Select;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static user_interfaces.Calculator.OBTAINED_RESULT;
import static utilities.constants.NumberAndOperations.EQ;

public class MathOperation implements Task {

    private String operation;
    private int firstNumber;
    private int secondNumber;

    public MathOperation(String operation, int firstNumber, int secondNumber) {
        this.operation = operation;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    @Step("{0} has performed an operation")
    public <T extends Actor> void performAs(T actor) {
        String expectedResult = String.valueOf(firstNumber + secondNumber);
        actor.remember("ExpectedResult", expectedResult);
        actor.attemptsTo(Select.theNumber(firstNumber));
        actor.attemptsTo(Select.theOperation(operation));
        actor.attemptsTo(Select.theNumber(secondNumber));
        actor.attemptsTo(Select.theOperation(EQ));
        actor.remember("ObtainedResult", OBTAINED_RESULT.resolveFor(actor).getText());
    }
}
