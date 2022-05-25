package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.AdvantageRegistration;

public class RegistrationDataBasic implements Task {
    private String userName, email, password, confirmPassword, firstName, lastName,
            phoneNumber, country, city, address, stateProvinceRegion, postalCode;

    public RegistrationDataBasic(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    public static RegistrationDataBasic the(String userName, String password) {
        return Tasks.instrumented(RegistrationDataBasic.class, userName, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(this.userName).into(AdvantageRegistration.USER_NAME),
                Enter.theValue(this.password).into(AdvantageRegistration.PASSWORD)
        );
    }
}