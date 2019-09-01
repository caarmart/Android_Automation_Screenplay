package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static user_interfaces.Calculator.MAIN_SCREEN;

public class Load implements Interaction {

    public static Load theApplication() {
        return instrumented(Load.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        MAIN_SCREEN.resolveFor(actor).shouldBeVisible();
        System.out.println("");


        System.out.println("");        System.out.println("");        System.out.println("");        System.out.println("");        System.out.println("");        System.out.println("");        System.out.println("");        System.out.println("");        System.out.println("");
        System.out.println("");
        System.out.println("");        System.out.println("");        System.out.println("");
        System.out.println("");        System.out.println("");        System.out.println("");
        System.out.println("");        System.out.println("");
        System.out.println("");        System.out.println("");        System.out.println("");
        System.out.println("");









    }
}