package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.AdvantageHomePage;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.AdvantageHomePage.CREATE_ACCOUNT_BUTTON;
import static userinterface.AdvantageHomePage.USER_BUTTON;

public class CreateAccount implements Task {
    private AdvantageHomePage advantageHomePage;

    public static CreateAccount OnthePage() {
        return Tasks.instrumented(CreateAccount.class);
    }

    @Override
    public <T extends Actor > void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(USER_BUTTON, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(USER_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(30)))
        );
        actor.attemptsTo(
                WaitUntil.the(CREATE_ACCOUNT_BUTTON, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(CREATE_ACCOUNT_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(15)))
        );
    }

}