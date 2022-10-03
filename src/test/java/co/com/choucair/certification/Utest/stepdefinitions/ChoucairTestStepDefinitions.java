package co.com.choucair.certification.Utest.stepdefinitions;

import co.com.choucair.certification.Utest.model.TestChoucairData;
import co.com.choucair.certification.Utest.question.Answer;
import co.com.choucair.certification.Utest.tasks.Clic;
import co.com.choucair.certification.Utest.tasks.Complete;
import co.com.choucair.certification.Utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^that Juanito wants to register in Utest$")
    public void thatJuanitoWantsToRegisterInUtest(List<TestChoucairData> testChoucairData)throws Exception {
        OnStage.theActorCalled("juanito").wasAbleTo(OpenUp.thePage(), Clic.theButton());
    }

    @When("^he enters the registration data in the form$")
    public void heEntersTheRegistrationDataInTheForm(List<TestChoucairData> testChoucairData)throws Exception {
        OnStage.theActorCalled("juanito").attemptsTo(Complete.theForm(testChoucairData));
    }

    @Then("^he search confirm that the password is correct$")
    public void theSearchConfirmThatThePasswordIsCorrect(List<TestChoucairData> testChoucairData)throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(testChoucairData.get(0).getStrStateDone())));
    }
}
