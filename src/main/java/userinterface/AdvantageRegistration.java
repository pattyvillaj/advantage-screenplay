package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdvantageRegistration {
    public static final Target USER_NAME = Target.the("user field")
            .located(By.name("username"));
    public static final Target PASSWORD = Target.the("password field")
            .located(By.name("password"));
}
