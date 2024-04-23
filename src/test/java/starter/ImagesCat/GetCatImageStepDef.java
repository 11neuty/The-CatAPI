package starter.ImagesCat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class GetCatImageStepDef {
    @Steps
    ImagesCatAPI imagesCatAPI;

    @Given("Get cat images by id {string}")
    public void getCatImagesById(String id) {
        imagesCatAPI.getCatById(id);
    }

    @When("Send request get cat by ID")
    public void sendRequestGetCatByID() {
        SerenityRest.when().get(ImagesCatAPI.ID);
    }



}
