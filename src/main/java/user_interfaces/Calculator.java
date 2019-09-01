package user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static utilities.constants.ScreenplayStructure.USER_INTERFACE_CLASS;

public class Calculator {

    private Calculator() {
        throw new IllegalStateException(USER_INTERFACE_CLASS);
    }

    public static final Target MAIN_SCREEN = Target.the("Main Screen").located(By.id("com.android.calculator2:id/main_calculator"));
    public static final Target NUMBER1 = Target.the("Number 1").located(By.id("com.android.calculator2:id/digit_1"));
    public static final Target NUMBER2 = Target.the("Number 2").located(By.id("com.android.calculator2:id/digit_2"));
    public static final Target NUMBER3 = Target.the("Number 3").located(By.id("com.android.calculator2:id/digit_3"));
    public static final Target NUMBER4 = Target.the("Number 4").located(By.id("com.android.calculator2:id/digit_4"));
    public static final Target NUMBER5 = Target.the("Number 5").located(By.id("com.android.calculator2:id/digit_5"));
    public static final Target NUMBER6 = Target.the("Number 6").located(By.id("com.android.calculator2:id/digit_6"));
    public static final Target NUMBER7 = Target.the("Number 7").located(By.id("com.android.calculator2:id/digit_7"));
    public static final Target NUMBER8 = Target.the("Number 8").located(By.id("com.android.calculator2:id/digit_8"));
    public static final Target NUMBER9 = Target.the("Number 9").located(By.id("com.android.calculator2:id/digit_9"));
    public static final Target NUMBER0 = Target.the("Number 0").located(By.id("com.android.calculator2:id/digit_0"));
    public static final Target ADD = Target.the("Sum button").located(By.id("com.android.calculator2:id/op_add"));
    public static final Target MINUS = Target.the("Minus button").located(By.id("com.android.calculator2:id/op_sub"));
    public static final Target MUL = Target.the("Mul button").located(By.id("com.android.calculator2:id/op_mul"));
    public static final Target DIV = Target.the("Div button").located(By.id("com.android.calculator2:id/op_div"));
    public static final Target EQ = Target.the("Equal button").located(By.id("com.android.calculator2:id/eq"));
    public static final Target OBTAINED_RESULT = Target.the("Obtained result").located(By.id("com.android.calculator2:id/result"));
}
