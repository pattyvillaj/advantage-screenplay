package tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterface.AdvantageRegistration;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.AdvantageHomePage.USER_BUTTON;
import static userinterface.AdvantageRegistration.*;

public class RegistrationDataBasic implements Task {
    private String userName, email, password, confirmPassword, firstName, lastName,
            phoneNumber, country, city, address, stateProvinceRegion, postalCode;

    public RegistrationDataBasic(String userName, String email, String password, String confirmPassword, String firstName, String lastName,
                                 String phoneNumber, String country, String city, String address, String stateProvinceRegion, String postalCode) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.country = country;
        this.city = city;
        this.address = address;
        this.stateProvinceRegion = stateProvinceRegion;
        this.postalCode = postalCode;

    }

    public static RegistrationDataBasic the(String userName, String email, String password, String confirmPassword, String firstName, String lastName,
                                            String phoneNumber, String country, String city, String address, String stateProvinceRegion, String postalCode ) {
        return Tasks.instrumented(RegistrationDataBasic.class, userName, email, password, confirmPassword, firstName,lastName,phoneNumber, country, city, address, stateProvinceRegion, postalCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(USER_NAME, isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue(this.userName).into(USER_NAME)
        );
        actor.attemptsTo(
                Enter.theValue(this.email).into(EMAIL)
        );
        actor.attemptsTo(
                Enter.theValue(this.password).into(PASSWORD)
        );
        actor.attemptsTo(
                Enter.theValue(this.confirmPassword).into(CONFIRM_PASSWORD)
        );
        actor.attemptsTo
                (Enter.theValue(this.firstName).into(FIRST_NAME)
        );
        actor.attemptsTo(
                Enter.theValue(this.lastName).into(LAST_NAME)
        );
        actor.attemptsTo(
                Enter.theValue(this.phoneNumber).into(PHONE_NUMBER)
        );
        /* actor.attemptsTo(
                Click.on(COUNTRY.waitingForNoMoreThan(Duration.ofMinutes(2))),
                //Hit.the(Keys.ARROW_DOWN).into(COUNTRY),
                Enter.theValue(this.country).into(COUNTRY.waitingForNoMoreThan(Duration.ofMinutes(2))),
                Hit.the(Keys.ENTER).into(COUNTRY)
        );*/

        actor.attemptsTo(
                Enter.theValue(this.city).into(CITY)
        );
        actor.attemptsTo(
                Enter.theValue(this.address).into(ADDRESS)
        );
        actor.attemptsTo(
                Enter.theValue(this.stateProvinceRegion).into(STATE_PROVINCE_REGION)
        );
        actor.attemptsTo(
                Enter.theValue(this.postalCode).into(POSTAL_CODE)
        );
        actor.attemptsTo(
                Click.on(CHECK_AGREE.waitingForNoMoreThan(Duration.ofSeconds(15)))
        );

        actor.attemptsTo(
                WaitUntil.the(REGISTRE_BUTTON, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(REGISTRE_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(15)))
        );

    }
}