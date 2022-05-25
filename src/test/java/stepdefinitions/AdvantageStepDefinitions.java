package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AdvantageData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.OpenUp;
import tasks.CreateAccount;
import tasks.RegistrationDataBasic;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AdvantageStepDefinitions {

    @Before
    public void setStage() { setTheStage(new OnlineCast());

    }

    @Given("^than (.*) wants to register on the Advantage page$")
    public void thanAnaWantsToRegisterOnTheAdvantagePage(String actor) {
        theActorCalled(actor).wasAbleTo(OpenUp.thePage(), CreateAccount.OnthePage());
    }

    @When("^she enters her data in the registration form$")
    public void sheEntersHerDataInTheRegistrationForm(List<AdvantageData> advantageData) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                RegistrationDataBasic.the(advantageData.get(0).getUserName(),advantageData.get(0).getEmail(),advantageData.get(0).getPassword(),advantageData.get(0).getPassword(),
                advantageData.get(0).getFirstName(),advantageData.get(0).getLastName(),advantageData.get(0).getPhoneNumber(), advantageData.get(0).getCountry(), advantageData.get(0).getCity(),advantageData.get(0).getAddress(),
                        advantageData.get(0).getStateProvinceRegion(),advantageData.get(0).getpostalCode()
        ));

    }

    @Then("^she will check that your registration was successful$")
    public void sheWillCheckThatYourRegistrationWasSuccessful(List<AdvantageData> advantageData) {
        theActorInTheSpotlight().should(seeThat(Answer.toThe(advantageData.get(0).getUserName())));
    }

}
