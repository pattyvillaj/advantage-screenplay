package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdvantageRegistration {
    public static final Target USER_NAME = Target.the("user field")
            .located(By.name("usernameRegisterPage"));

    public static final Target EMAIL = Target.the("user field")
            .located(By.name("emailRegisterPage"));

    public static final Target PASSWORD = Target.the("password field")
            .located(By.name("passwordRegisterPage"));

    public static final Target CONFIRM_PASSWORD = Target.the("confirm password field")
            .located(By.name("confirm_passwordRegisterPage"));

    public static final Target FIRST_NAME = Target.the("first name")
            .located(By.name("first_nameRegisterPage"));

    public static final Target LAST_NAME = Target.the("last name")
            .located(By.name("last_nameRegisterPage"));

    public static final Target PHONE_NUMBER = Target.the("phone number")
            .located(By.name("phone_numberRegisterPage"));

    public static final Target COUNTRY = Target.the("input country")
            .located(By.name("countryListboxRegisterPage"));

    public static final Target CITY = Target.the("city")
            .located(By.name("cityRegisterPage"));

    public static final Target ADDRESS = Target.the("address")
            .located(By.name("addressRegisterPage"));

    public static final Target STATE_PROVINCE_REGION = Target.the("State province region")
            .located(By.name("state_/_province_/_regionRegisterPage"));

    public static final Target POSTAL_CODE = Target.the("postal code")
            .located(By.name("postal_codeRegisterPage"));

    public static final Target CHECK_AGREE = Target.the("agree term")
            .located(By.name("i_agree"));

    public static final Target REGISTRE_BUTTON = Target.the("registre button")
            .located(By.id("register_btnundefined"));
}

