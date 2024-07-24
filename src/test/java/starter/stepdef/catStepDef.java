package starter.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.catAPI.CatAPI;

public class catStepDef {
    @Steps
    CatAPI catAPI;

    @Given("Get cat by random image")
    public void getCatByRandomId(){
        catAPI.getCatByRandomCat();
    }
    @When("Send request get cat images")
    public void sendRequestGetRandomImage(){

    }
}
