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

public class CreateAccount implements Task {
    private AdvantageHomePage advantageHomePage;

    public static CreateAccount OnthePage() {
        return Tasks.instrumented(CreateAccount.class);
    }

    @Override
    public <T extends Actor > void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AdvantageHomePage.USER_BUTTON)
        );
        actor.attemptsTo(
                WaitUntil.the(AdvantageHomePage.CREATE_ACCOUNT_BUTTON
                        .waitingForNoMoreThan(Duration.ofSeconds(20)), isEnabled())
        );
        actor.attemptsTo(
                Click.on(AdvantageHomePage.CREATE_ACCOUNT_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(20)))
        );
    }

}