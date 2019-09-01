package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import user_interfaces.Calculator;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static user_interfaces.Calculator.*;
import static utilities.constants.NumberAndOperations.ADD;
import static utilities.constants.NumberAndOperations.DIV;
import static utilities.constants.NumberAndOperations.EQ;
import static utilities.constants.NumberAndOperations.MINUS;
import static utilities.constants.NumberAndOperations.MUL;
import static utilities.constants.NumberAndOperations.*;

public class Select implements Interaction {

    private static Target target;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(target));
        target = null;
    }

    public static Select theNumber(int number) {

        switch (number) {
            case NUMBER_0:
                target = NUMBER0;
                break;
            case NUMBER_1:
                target = NUMBER1;
                break;
            case NUMBER_2:
                target = NUMBER2;
                break;
            case NUMBER_3:
                target = NUMBER3;
                break;
            case NUMBER_4:
                target = NUMBER4;
                break;
            case NUMBER_5:
                target = NUMBER5;
                break;
            case NUMBER_6:
                target = NUMBER6;
                break;
            case NUMBER_7:
                target = NUMBER7;
                break;
            case NUMBER_8:
                target = NUMBER8;
                break;
            case NUMBER_9:
                target = NUMBER9;
                break;
            default:
        }
        return instrumented(Select.class, number);
    }

    public static Select theOperation(String mathOperation) {

        switch (mathOperation) {
            case ADD:
                target = Calculator.ADD;
                break;
            case MINUS:
                target = Calculator.MINUS;
                break;
            case MUL:
                target = Calculator.MUL;
                break;
            case DIV:
                target = Calculator.DIV;
                break;
            case EQ:
                target = Calculator.EQ;
                break;
            default:
        }
        return instrumented(Select.class, mathOperation);
    }
}