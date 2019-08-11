package tasks;

import interactions.Select;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static user_interfaces.Calculator.OBTAINED_RESULT;
import static utilities.NumberAndOperations.EQUALS;

public class MathOperation implements Task {

    private String mathOperation;
    private int firstNumber;
    private int secondNumber;

    public MathOperation(String mathOperation, int firstNumber, int secondNumber) {
        this.mathOperation = mathOperation;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String expectedResult = String.valueOf(firstNumber + secondNumber);
        actor.remember("ExpectedResult", expectedResult);
        actor.attemptsTo(Select.theNumber(firstNumber));
        actor.attemptsTo(Select.theOperation(mathOperation));
        actor.attemptsTo(Select.theNumber(secondNumber));
        actor.attemptsTo(Select.theOperation(EQUALS));
        actor.remember("ObtainedResult", OBTAINED_RESULT.resolveFor(actor).getText());
    }
}