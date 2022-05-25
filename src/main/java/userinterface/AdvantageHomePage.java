package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AdvantageHomePage extends PageObject {

    public static final Target USER_BUTTON = Target.the("button to write user")
            .located(By.id("hrefUserIcon"));
    public static final Target CREATE_ACCOUNT_BUTTON = Target.the("Click in the botton Create Account")
            .located(By.xpath("//a[@class='create-new-account ng-scope']"));

    public static final Target MENU_USER = Target.the("Click in the botton Create Account")
            .located(By.id("menuUserLink"));
}